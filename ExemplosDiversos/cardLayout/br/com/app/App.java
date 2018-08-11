package br.com.app;

import br.com.controller.TelaController;
import br.com.view.Tela;

public class App {
	public static void main(String[] args) {
		new TelaController(new Tela());
	}
}
