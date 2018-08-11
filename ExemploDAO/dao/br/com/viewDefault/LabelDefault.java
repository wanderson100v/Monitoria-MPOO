package br.com.viewDefault;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelDefault extends JLabel {
	
	public LabelDefault(String nome,Integer TamanhoFont) {
		this();
		setFont(new Font("verdana",Font.PLAIN,TamanhoFont));
		setText(nome);
	}
	
	public LabelDefault(String nome) {
		this();
		setText(nome);
	}
	
	public LabelDefault() {
		setForeground(new Color(0,0,0));
		setFont(new Font("verdana",Font.PLAIN,12));
	}
}
