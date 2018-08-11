package br.com.dao;


import java.util.List;

import br.com.excecoes.DaoException;
import br.com.vo.Usuario;

public interface IDaoUsuario {
	
	public void salvarUsuarios(List<Usuario> usuarios) throws DaoException;
	public List<Usuario> carregarUsuarios() throws DaoException;
}
