package br.com.app;

import br.com.bo.BusinessUsuario;
import br.com.bo.IBusinessUsuario;
import br.com.controller.TelaPrincipalController;
import br.com.excecoes.BusinessException;
import br.com.view.TelaPrincipal;
import br.com.vo.Usuario;

public class App {
	public static void main(String[] args) {
		
		// apenas deixando um usuario já cadastrado
		/*IBusinessUsuario businessUsuario = new BusinessUsuario();
		try {
			businessUsuario.cadastrarUsuario(new Usuario("wanderson","1234"));
		} catch (BusinessException e) {
			e.printStackTrace();
		}*/
		
		TelaPrincipalController telaPrincipalController = new TelaPrincipalController(new TelaPrincipal());
		telaPrincipalController.control();
	}
	
	
}
