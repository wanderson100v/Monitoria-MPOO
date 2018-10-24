package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.TelaPrincipal;

public class TelaPrincipalController  implements KeyListener{
	//referência a quem controla
	private TelaPrincipal telaPrincipal;

	public TelaPrincipalController(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		control();
	}
	
	public void control() {
		//ActionListener - problema mostrar no label ao clikar no botão o que se encontra no textField
		telaPrincipal.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaPrincipal.getLabel().setText(telaPrincipal.getField().getText());
			}
		}); // tipo anônimo
		
		//telaPrincipal.getButton().addActionListener((arg0)-> telaPrincipal.getLabel().setText( telaPrincipal.getField().getText())); // conteúdo adicional : utilizando lambda 
		
		//MouseListener - mudar cor do label ao clicar de preto para vermelho e vice-versa
		
		telaPrincipal.getLabel().addMouseListener(new MouseHandler()); // classe interna
		
		telaPrincipal.getField().addKeyListener(this); // na propria classe ("Top-level")
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("Tl");
		if(arg0.getKeyChar() == 's') {
			System.exit(0);
		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {	
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	
	public class MouseHandler implements MouseListener {
		private boolean validador = false; 
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if(validador) {
				telaPrincipal.getLabel().setForeground(Color.black);
				validador = false;
			}else {
				telaPrincipal.getLabel().setForeground(Color.red);
				validador = true;
			}
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {}

		@Override
		public void mouseExited(MouseEvent arg0) {}

		@Override
		public void mousePressed(MouseEvent arg0) {}

		@Override
		public void mouseReleased(MouseEvent arg0) {}
		
	}
	// outra maneira é utilizando o adapter referente ao evento ex.

	/*public class MouseHandlerAdapter extends MouseAdapter {
	private boolean validador = false; 
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(validador) {
			telaPrincipal.getLabel().setForeground(Color.black);
			validador = false;
		}else {
			telaPrincipal.getLabel().setForeground(Color.red);
			validador = true;
		}
	}
	
}*/
}
