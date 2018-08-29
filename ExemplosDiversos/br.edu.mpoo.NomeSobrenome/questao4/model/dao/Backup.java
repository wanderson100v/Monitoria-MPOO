package model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

import exceptions.DaoException;
import model.vo.Ponto;
import model.vo.Ponto2D;
import model.vo.Ponto3D;

public class Backup implements IDaoBackup {
	private static ArrayList<Ponto> pontos = new ArrayList<>();
	private XStream xstrem;
	
	public Backup() {
		xstrem = new XStream(new Dom4JDriver());
		xstrem.processAnnotations(Ponto.class);
		xstrem.processAnnotations(Ponto2D.class);
		xstrem.processAnnotations(Ponto3D.class);
	}
	
	@Override
	public void backup() throws DaoException {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("file/pontos.xml"))){
			if(!pontos.isEmpty())
				bw.write(xstrem.toXML(pontos));
		}catch (Exception e) {
			throw new DaoException("Erro ao fazer Backup");
		}
	}
	@Override
	public void salvarPonto(Ponto ponto) {
		pontos.add(ponto);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ponto> getPontos() throws DaoException {
		try{
			BufferedReader br = new BufferedReader(new FileReader("file/pontos.xml"));
			xstrem.autodetectAnnotations(true);
			List<Ponto> p = (ArrayList<Ponto>) xstrem.fromXML(br);
			System.out.println("sim");
			return p;
		}catch (IOException e) {
			throw new DaoException("Erro ao carregar pontos");
		}
	}

}
