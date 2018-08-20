package br.com.view;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaView extends JFrame implements Observer {

	private JLabel outputLabel;
	private JTextField inputField;
	
	public TelaView(){
		//new
		this.outputLabel = new JLabel();
		this.inputField = new JTextField(10);
		JLabel descricao = new JLabel("Digite algo e pressione enter:");
		//add
		this.add(outputLabel);
		this.add(descricao);
		this.add(inputField);
		//set
		this.outputLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.setLayout(new GridLayout(3,1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(200,100);
	}

	public JLabel getOutputLabel() {
		return outputLabel;
	}

	public void setOutputLabel(JLabel outputLabel) {
		this.outputLabel = outputLabel;
	}

	public JTextField getInputField() {
		return inputField;
	}

	public void setInputField(JTextField inputField) {
		this.inputField = inputField;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		outputLabel.setText((String) arg1);
	}
	
}
