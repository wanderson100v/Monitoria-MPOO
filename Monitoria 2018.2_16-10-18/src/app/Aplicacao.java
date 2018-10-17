package app;

import controller.LoginController;
import model.BaseDados;
import model.Funcionario;
import model.LoginModel;
import view.LoginView;

public class Aplicacao {
	
	/*
	   para fins didáticos  os usuaios foram previamente adionados na app (em tempo de execução) 
	   inha 17 a 20, o que ocorre na prática é todos os dados ja estarem salvos em ROM(gravados na memória)
	   seja em XML,txt, ou outro(BD), isso será visto adiante.
	*/
	public static void main(String[] args) {
		BaseDados.addFuncionario(new Funcionario("wanderson", "dasd",1));
		BaseDados.addFuncionario(new Funcionario("Daniela", "dasd",2));
		BaseDados.addFuncionario(new Funcionario("Tainan", "dasd",3));
		BaseDados.addFuncionario(new Funcionario("God_abi", "dasd",4));
		// instânciação de controlador que recebe suas dependencias no caso é quem ele intermedia as relações
		LoginController loginController = new LoginController(new LoginModel(), new LoginView());
		loginController.control();
		
	}

}