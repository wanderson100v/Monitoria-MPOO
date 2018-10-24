package app;

import controller.TelaPrincipalController;
import view.TelaPrincipal;

public class Aplicacao {
	public static void main(String[] args) {
		new TelaPrincipalController(new TelaPrincipal());
	}
}
