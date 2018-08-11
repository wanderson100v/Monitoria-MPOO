package br.com.viewDefault;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class BotaoDefault extends JButton {
	
	public BotaoDefault(String nome ) {
		super(nome);
		setBackground(new Color(255,255,255));
		setBorder(BorderFactory.createLineBorder(Color.black,3));
		setFont(new Font("verdana",Font.PLAIN,12));
		setPreferredSize(new Dimension(120,30));
		setFocusable(false);
	}
}
