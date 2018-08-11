package br.com.view;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void imprimirMsg(String msg) {
		JOptionPane.showMessageDialog(null,msg);
	}
	public static int confirmacaoMsg(String msg, String titulo) {
		return JOptionPane.showConfirmDialog(null,msg,titulo, JOptionPane.YES_OPTION);
	}
	
}
