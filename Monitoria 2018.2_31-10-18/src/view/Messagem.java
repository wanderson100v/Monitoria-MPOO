package view;

import javax.swing.JOptionPane;

public class Messagem {
	public static void imprimirMsg(String titulo,String msg,int tipo) {
		JOptionPane.showMessageDialog(null, msg, titulo, tipo);
	}
}
