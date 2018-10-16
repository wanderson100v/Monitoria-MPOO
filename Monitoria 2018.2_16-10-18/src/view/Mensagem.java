package view;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void exibirMensagem(String msg,String titulo) {
		JOptionPane.showMessageDialog(null,msg,titulo,JOptionPane.INFORMATION_MESSAGE);
	}
}
