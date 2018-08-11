package br.com.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Wanderson Pereira
 * Exemplo de card layout para monitoria de mpoo
 *
 */
public class Tela extends JFrame{
	private JPanel panelComCard,panel1,panel2;
	private JButton irPanellButton,irPanel2Button;
	private CardLayout card;
	public Tela() {
		
		//criação
		this.panelComCard = new JPanel();
		this.panel1 = new JPanel();
		this.panel2 = new JPanel();
		this.card = new CardLayout();
		this.irPanellButton = new JButton("IR panel um");
		this.irPanel2Button = new JButton("IR panel dois");
		
		//set
		panelComCard.setLayout(card);
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.yellow);
		card.addLayoutComponent(panel1, "1");
		card.addLayoutComponent(panel2, "2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,300);
		
		//add
		panel1.add(irPanel2Button);
		panel2.add(irPanellButton);
		panelComCard.add(panel1);
		panelComCard.add(panel2);
		
		add(panelComCard); 
		
		
		card.show(panelComCard,"1");
		
	}
	public JPanel getPanelComCard() {
		return panelComCard;
	}
	public JButton getIrPanellButton() {
		return irPanellButton;
	}
	public JButton getIrPanel2Button() {
		return irPanel2Button;
	}
	public CardLayout getCard() {
		return card;
	}
	
	
}
