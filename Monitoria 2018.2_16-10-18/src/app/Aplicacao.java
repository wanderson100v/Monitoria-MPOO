package app;

import controller.LoginController;
import model.BaseDados;
import model.Funcionario;
import model.LoginModel;
import view.LoginView;

public class Aplicacao {
	
	
	public static void main(String[] args) {
		
		BaseDados.addFuncionario(new Funcionario("wanderson", "dasd",1));
		BaseDados.addFuncionario(new Funcionario("Daniela", "dasd",2));
		BaseDados.addFuncionario(new Funcionario("Tainan", "dasd",3));
		BaseDados.addFuncionario(new Funcionario("God_abimael", "dasd",4));
		
		LoginController loginController = new LoginController(new LoginModel(), new LoginView());
		loginController.control();
	}
	
}
