package view;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void imprimirMsg(String title,String msg,int tipo){
		JOptionPane.showMessageDialog(null, msg, title, tipo);
	}
}
