package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.view.Tela;

/**
 * 
 * @author Wanderson Pereira
 * Exemplo de card layout para monitoria de mpoo
 *
 */
public class TelaController implements ActionListener{
	private Tela tela;

	public TelaController(Tela tela) {
		this.tela = tela;
		this.tela.getIrPanellButton().addActionListener(this);
		this.tela.getIrPanel2Button().addActionListener(this);
		this.tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.tela.getIrPanellButton()){
			this.tela.getCard().show(this.tela.getPanelComCard(),"1");
		}else if(e.getSource() == this.tela.getIrPanel2Button()) {
			this.tela.getCard().show(this.tela.getPanelComCard(),"2");
		}
	}
	
	
	
	
}
