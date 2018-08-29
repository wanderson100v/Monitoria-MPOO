package view;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NovoPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JRadioButton jrb2d, jrb3d;
	private JTextField fldCx,fldCy,fldCz;
	private Lininhagenerica line4;
	
	public NovoPanel() {
		super(new GridLayout(4,1));
		
		Lininhagenerica line1 = new Lininhagenerica();
		jrb2d = new JRadioButton("2D");
		jrb3d = new JRadioButton("3D");
		jrb2d.setSelected(true);
		line1.add(jrb2d);
		line1.add(jrb3d);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(jrb2d);
		grupo.add(jrb3d);
		
		Lininhagenerica line2 = new Lininhagenerica();
		line2.add(new JLabel("Coord X:"));
		fldCx = new JTextField(5);
		line2.add(fldCx);
		
		Lininhagenerica line3 = new Lininhagenerica();
		line3.add(new JLabel("Coord Y:"));
		fldCy = new JTextField(5);
		line3.add(fldCy);
		
		line4 = new Lininhagenerica();
		line4.add(new JLabel("Coord Z:"));
		fldCz = new JTextField(5);
		line4.add(fldCz);
		
		add(line1);
		add(line2);
		add(line3);
		add(line4);
		
		line4.setVisible(false);
		setVisible(false);
		
	}
	
	
	public JRadioButton getJrb2d() {
		return jrb2d;
	}


	public JRadioButton getJrb3d() {
		return jrb3d;
	}


	public JTextField getFldCx() {
		return fldCx;
	}


	public JTextField getFldCy() {
		return fldCy;
	}


	public JTextField getFldCz() {
		return fldCz;
	}


	public Lininhagenerica getLine4() {
		return line4;
	}


	/*public static void main(String[] args) {
		JFrame f = new JFrame();
		f.add(new NovoPanel());
		f.setSize(100,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/
}
