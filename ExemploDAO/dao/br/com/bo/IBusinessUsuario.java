package br.com.bo;

import br.com.excecoes.BusinessException;
import br.com.vo.Usuario;

public interface IBusinessUsuario {
	public void cadastrarUsuario(Usuario usuario) throws BusinessException ; 
	public Usuario validarLogin(Usuario usuario) throws BusinessException;
}
