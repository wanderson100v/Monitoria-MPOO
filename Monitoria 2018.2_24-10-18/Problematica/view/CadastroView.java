package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroView extends JFrame {
	private JLabel nomeLabel,emailLabel,idadeLabel,enderecoLabel,telefoneLabel;
	private JTextField nomeField,emailField,idadeField,enderecoField,telefoneField;
	private JButton cadastrarButton, sairButton;
	
	public CadastroView() {
		setLayout(new GridLayout(6,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(250,250);
		
		this.nomeLabel = new JLabel("NOME");
		this.emailLabel = new JLabel("EMAIL");
		this.idadeLabel = new JLabel("IDADE");
		this.enderecoLabel = new JLabel("ENDEREÇO");
		this.telefoneLabel = new JLabel("TELEFONE");
		this.nomeField = new JTextField(8);
		this.emailField = new JTextField(8);
		this.idadeField = new JTextField(8);
		this.enderecoField = new JTextField(8);
		this.telefoneField = new JTextField(8);
		this.cadastrarButton = new JButton("CADASTRAR");
		this.sairButton = new JButton("SAIR");
		
		add(nomeLabel);
		add(nomeField);
		add(emailLabel);
		add(emailField);
		add(idadeLabel);
		add(idadeField);
		add(enderecoLabel);
		add(enderecoField);
		add(telefoneLabel);
		add(telefoneField);
		add(sairButton);
		add(cadastrarButton);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CadastroView();
	}
	
	
	
}
