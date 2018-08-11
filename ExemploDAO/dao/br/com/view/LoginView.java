package br.com.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.viewDefault.BotaoDefault;
import br.com.viewDefault.LabelDefault;
import br.com.viewDefault.PaneDefault;

public class LoginView extends PaneDefault{
	private BotaoDefault confirmarButton,sairButton,cadastrarButton;
	private JTextField loginField,senhaField;
	private LabelDefault loginLabel,senhaLabel;
	public LoginView() {
		
		
		//criar
		this.confirmarButton = new BotaoDefault("Confirmar");
		this.sairButton = new BotaoDefault("X");
		this.cadastrarButton = new BotaoDefault("Cadastrar");
		
		this.loginField = new JTextField(10);
		this.senhaField = new JTextField(10);
		this.loginLabel = new LabelDefault("LOGIN ",18);
		this.senhaLabel = new LabelDefault("SENHA ",18);
		
		//set 
		setLayout(new FlowLayout(FlowLayout.CENTER,0,100));
		//add
		JPanel panelComGrid = new JPanel(new GridLayout(4,1));
		
		JPanel linha0Panel = new JPanel();
		linha0Panel.add(sairButton);
		((FlowLayout)(linha0Panel.getLayout())).setAlignment(FlowLayout.RIGHT);
		sairButton.setPreferredSize(new Dimension(30,30));
		panelComGrid.add(linha0Panel);
		
		JPanel linha1Panel = new JPanel();
		linha1Panel.add(loginLabel);
		linha1Panel.add(loginField);
		linha1Panel.setBackground(new Color(222,184,135));
		panelComGrid.add(linha1Panel);
		
		JPanel linha2Panel = new JPanel();
		linha2Panel.add(senhaLabel);
		linha2Panel.add(senhaField);
		linha2Panel.setBackground(new Color(222,184,135));
		panelComGrid.add(linha2Panel);
		
		JPanel linha3Panel  = new JPanel();
		linha3Panel.add(confirmarButton);
		//linha3Panel.add(sairButton);
		linha3Panel.add(cadastrarButton);
		linha3Panel.setBackground(new Color(222,184,135));
		panelComGrid.add(linha3Panel);
		panelComGrid.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		add(panelComGrid);
		

	}
	public BotaoDefault getConfirmarButton() {
		return confirmarButton;
	}
	public BotaoDefault getSairButton() {
		return sairButton;
	}
	public JTextField getLoginField() {
		return loginField;
	}
	public JTextField getSenhaField() {
		return senhaField;
	}
	public BotaoDefault getCadastrarButton() {
		return cadastrarButton;
	}
	
	
	
	
	
	
}
