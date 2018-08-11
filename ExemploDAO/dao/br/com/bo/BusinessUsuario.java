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
			validarUsuario(usuario, usuarios); // se ocorrer exceção aqui a proxima linha não é executada , ou seja nada é salvo
			usuarios.add(usuario);
			daoUsuario.salvarUsuarios(usuarios);
		
		} catch (DaoException | ValidarException e) {
			throw new BusinessException(e.getMessage());
		}
	}
	private void validarUsuario(Usuario usuario, List<Usuario> usuarios ) throws ValidarException{
		// obs: metodo trim retira espaços do inicio e final , assim mesmo se usuario digitar espaços em branco a validação ira ser efetiva
		if(usuario.getLogin().trim().length() !=0 || usuario.getLogin().trim().length() != 0 ) { // o nome ou senha do usuario esta vazio?
			for(Usuario u: usuarios) {
				if(u.getLogin().equalsIgnoreCase(usuario.getLogin())) // caso exista um usuario com esse mesmo login é retornado a exception de validação
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
