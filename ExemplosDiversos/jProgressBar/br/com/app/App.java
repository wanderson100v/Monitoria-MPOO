package br.com.app;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class App extends Thread{
	
	public static void main(String[] args) {
		Tela tela = new Tela();
		//tela.getProgresso().setValue(100);
		
		new Thread(new Runnable() {
			public void run() {
				int value =0;;
				int aux = 4;
				while(true){
					value+=aux;
					if(value > 100 || value <0)
						aux *=-1;
					tela.getProgresso().setValue(value);
					
					try {
						sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	
	}
}
class Tela extends JFrame{
	private JProgressBar progresso;
	
	public Tela(){
		super("Exemplo JProgressBar");
		
		progresso = new JProgressBar();
		
		add(progresso);
		
		progresso.setForeground(Color.red);
		progresso.setBackground(Color.BLACK);
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}

	public JProgressBar getProgresso() {
		return progresso;
	}
}
