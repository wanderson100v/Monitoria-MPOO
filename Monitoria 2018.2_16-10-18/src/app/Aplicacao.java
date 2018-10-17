package app;

import controller.LoginController;
import model.BaseDados;
import model.Funcionario;
import model.LoginModel;
import view.LoginView;

public class Aplicacao {
	
	/*
	   para fins did�ticos  os usuaios foram previamente adionados na app (em tempo de execu��o) 
	   inha 17 a 20, o que ocorre na pr�tica � todos os dados ja estarem salvos em ROM(gravados na mem�ria)
	   seja em XML,txt, ou outro(BD), isso ser� visto adiante.
	*/
	public static void main(String[] args) {
		BaseDados.addFuncionario(new Funcionario("wanderson", "dasd",1));
		BaseDados.addFuncionario(new Funcionario("Daniela", "dasd",2));
		BaseDados.addFuncionario(new Funcionario("Tainan", "dasd",3));
		BaseDados.addFuncionario(new Funcionario("God_abi", "dasd",4));
		// inst�ncia��o de controlador que recebe suas dependencias no caso � quem ele intermedia as rela��es
		LoginController loginController = new LoginController(new LoginModel(), new LoginView());
		loginController.control();
		
	}

}