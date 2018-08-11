package br.com.bo;

import java.util.List;

import br.com.dao.DaoUsuario;
import br.com.dao.IDaoUsuario;
import br.com.excecoes.BusinessException;
import br.com.excecoes.DaoException;
import br.com.excecoes.ValidarException;
import br.com.vo.Usuario;

public class BusinessUsuario implements IBusinessUsuario{
	private IDaoUsuario daoUsuario;

	public BusinessUsuario() {
		daoUsuario = new DaoUsuario();
	}

	@Override
	public void cadastrarUsuario(Usuario usuario) throws BusinessException {
		try {
			
			List<Usuario> usuarios = daoUsuario.carregarUsuarios();
			validarUsuario(usuario, usuarios); // se ocorrer exce��o aqui a proxima linha n�o � executada , ou seja nada � salvo
			usuarios.add(usuario);
			daoUsuario.salvarUsuarios(usuarios);
		
		} catch (DaoException | ValidarException e) {
			throw new BusinessException(e.getMessage());
		}
	}
	private void validarUsuario(Usuario usuario, List<Usuario> usuarios ) throws ValidarException{
		// obs: metodo trim retira espa�os do inicio e final , assim mesmo se usuario digitar espa�os em branco a valida��o ira ser efetiva
		if(usuario.getLogin().trim().length() !=0 || usuario.getLogin().trim().length() != 0 ) { // o nome ou senha do usuario esta vazio?
			for(Usuario u: usuarios) {
				if(u.getLogin().equalsIgnoreCase(usuario.getLogin())) // caso exista um usuario com esse mesmo login � retornado a exception de valida��o
					throw new ValidarException("LOGIN EM "+usuario.getLogin().toUpperCase()+" USO ESCOLHA\nOUTRO NOME PARA CADASTRO");
			}
		}else {
			throw new ValidarException("CAMPOS VAZIOS");
		}
	}

	@Override
	public Usuario validarLogin(Usuario usuario) throws BusinessException {
		try {
			List<Usuario> usuarios = daoUsuario.carregarUsuarios();
			for(Usuario usuarioBase :usuarios) {
				if (usuarioBase.getLogin().equalsIgnoreCase(usuario.getLogin()) 
						&& usuarioBase.getSenha().equals(usuario.getSenha()))
					return usuarioBase;
			}
			
			throw new BusinessException("LOGIN OU SENHA INVALIDOS, IMPOSSIBILIDADE DE LOGIN");
		} catch (DaoException e) {
			throw new BusinessException(e.getMessage());
		}
		
		
	}
	
}
