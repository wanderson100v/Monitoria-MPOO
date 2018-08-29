package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bntNovo, bntSair,bntShow, bntAdd;
	private NovoPanel panelNovo;
	
	public TelaPrincipal() {
		Lininhagenerica linhaTopo = new Lininhagenerica(),linhaBaixo = new Lininhagenerica();
		panelNovo = new NovoPanel();
		this.bntNovo = new JButton("Novo");
		this.bntSair = new JButton("Sair");
		linhaTopo.add(bntNovo);
		linhaTopo.add(bntSair);
		this.bntShow = new JButton("Show");
		this.bntAdd = new JButton("Add");
		linhaBaixo.add(bntAdd);
		linhaBaixo.add(bntShow);
		
		add(BorderLayout.NORTH, linhaTopo);
		add(BorderLayout.CENTER, panelNovo);
		add(BorderLayout.SOUTH, linhaBaixo);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(150,200);
		setResizable(false);
		
	}

	public JButton getBntNovo() {
		return bntNovo;
	}

	public JButton getBntSair() {
		return bntSair;
	}

	public JButton getBntShow() {
		return bntShow;
	}

	public JButton getBntAdd() {
		return bntAdd;
	}

	public NovoPanel getPanelNovo() {
		return panelNovo;
	}
	
	public static void main(String[] args) {
		new TelaPrincipal().setVisible(true);
	}
	
	
}
