package br.com.app;

import br.com.controller.TelaController;
import br.com.model.Model;
import br.com.view.TelaView;

public class App {
	public static void main(String[] args) {
		new TelaController(new Model("texto"),new TelaView());
	}
}
