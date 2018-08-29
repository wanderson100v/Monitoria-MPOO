package app;

import javax.swing.JOptionPane;

import controller.ControllerTelaPrincipal;
import exceptions.DaoException;
import model.bo.BusinessBackup;
import model.bo.IBusinessBackup;
import view.Mensagem;
import view.TelaPrincipal;

public class App extends Thread{
	public static void main(String[] args) {
		new ControllerTelaPrincipal(new TelaPrincipal()).control();
		new App().start();
	}
	@Override
	public void run() {
		IBusinessBackup businessBackup = new BusinessBackup();
		while(true){
			try {
				sleep(1000);
				businessBackup.backup();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (DaoException e) {
				Mensagem.imprimirMsg("Error",e.getMessage(), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
