package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.model.Model;
import br.com.view.TelaView;

public class TelaController implements ActionListener{
	private Model model;
	private TelaView telaView;
	
	public TelaController(Model model, TelaView telaView) {
		super();
		this.model = model;
		this.telaView = telaView;
		
		this.model.addObserver(telaView);
		
		this.telaView.getInputField().addActionListener(this);
		this.telaView.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// atualizando o model com conteudo da tela
		this.model.setTexto(telaView.getInputField().getText());
		
		/* obs o model é um observavel , foi definido no setText que ao mudar o texto
		 * é notificado aos ouvintes uma alteração, no caso a telaView, que para o caso
		 *  foi adicionada na linha 18 como observavel do model
		 */
	}
	
}
