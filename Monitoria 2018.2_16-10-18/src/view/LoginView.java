package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginView extends JFrame {
	//atributos
	private JTextField campoLogin,campoSenha;
	private JButton logarButton;
	// construtor
	
	public LoginView() {
		//mudar caracteristicas de tela 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.cyan);
		
		//setResizable(false);
		//setLocationRelativeTo(null);
		
		//instanciação de atributos
		campoLogin = new JTextField(8);
		campoSenha = new JTextField(8);
		logarButton = new JButton("Logar");
		//adição de atrbutos a tela
		add(new JLabel("Login :"));
		add(campoLogin);
		add(new JLabel("Senha :"));
		add(campoSenha);
		add(logarButton);
		setVisible(true);
		
		
	}
	
	//metodos
	
	public JTextField getCampoLogin() {
		return campoLogin;
	}
	
	public JTextField getCampoSenha() {
		return campoSenha;
	}
	
	public JButton getLogarButton() {
		return logarButton;
	}
	
	

}
