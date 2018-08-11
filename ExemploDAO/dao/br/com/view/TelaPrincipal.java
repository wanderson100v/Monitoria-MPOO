package br.com.view;

import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {
	private LoginView loginView;
	
	public TelaPrincipal() {
		super("Sistema de login com DAO");
		
		//criar
		loginView = new LoginView();
		
		//add
		add(loginView);
		
		//set 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setLocationRelativeTo(null);
	}

	public LoginView getLoginView() {
		return loginView;
	}

	public void setLoginView(LoginView loginView) {
		this.loginView = loginView;
	}
	
	

}
