package view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * possibilidades de tratamento | 	   interface(s) associada(s)
 * 			mouse  							MouseListener , ...
 * 			teclado							KeyListerner
 * 			ação							ActionListener
 * 											ItemListener, etc.
 */
public class TelaPrincipal extends JFrame{
	// componentes 
	private JLabel label;
	private JTextField field;
	private JButton button;
	//private JPanel panel;
	
	public TelaPrincipal() {
		super("Exemplo monitoria");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		setLayout(new FlowLayout());
		
		this.label = new JLabel("Label");
		this.field = new JTextField(8);
		this.button = new JButton("button");
		label.setFont(new Font("serif",Font.PLAIN,20)); // apenas mudando font
				
		add(label);
		add(field);
		add(button);
		
		setVisible(true);
	}

	public JLabel getLabel() {
		return label;
	}

	public JTextField getField() {
		return field;
	}

	public JButton getButton() {
		return button;
	}
	
	
}
/*
class Componente{
	private ArrayList<Ouvinte> ouvintesDeAcao = new ArrayList<>();

	public void addOuvinteDeAcao(Ouvinte ouvinte) {
		ouvintesDeAcao.add(ouvinte);
	}
}
interface Ouvinte{
}*/
