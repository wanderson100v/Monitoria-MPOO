package app;

import controll.CadastroController;
import model.BasePessoas;
import view.CadastroView;

public class App {
	public static void main(String[] args) {
		// passando para os controlados ao controlador
		new CadastroController(new BasePessoas(),new CadastroView());
	}
}
