package br.com.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

import br.com.excecoes.DaoException;
import br.com.vo.Usuario;

public class DaoUsuario implements IDaoUsuario {
	private XStream xStream;
	
	public DaoUsuario() {
		this.xStream = new XStream(new Dom4JDriver());
		xStream.processAnnotations(Usuario.class);
	}

	@Override
	public void salvarUsuarios(List<Usuario> usuarios) throws DaoException {
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter("res/usuarios.xml"));
			b.write(xStream.toXML(usuarios));
			b.flush();
			b.close();
		} catch (IOException e) {
			throw new DaoException("ERRO AO SALVAR USUARIOS");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> carregarUsuarios() throws DaoException {
		try {
			File file = new File("res/usuarios.xml");
			if(!file.exists())
				return new ArrayList<Usuario>(); // se o arquivo não existe retorna uma lista vazia
			return ((List<Usuario>) (xStream.fromXML(new FileReader(file))));
		} catch (FileNotFoundException e) {
			throw new DaoException("ERRO AO CARREGAR LISTA DE USUARIOS");
		}
	}

}
	