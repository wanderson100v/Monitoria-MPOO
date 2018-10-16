package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Funcionario;
import model.LoginModel;
import view.LoginView;
import view.Mensagem;

/**
 * Controller � responsavel por intermediar rela��es entre modelo e vis�o, e como a vis�o vai agir 
 * a determinada a��o do usuario(eventos) 
 * @author ragnar
 *
 */
public class LoginController implements ActionListener {
	private LoginModel loginModel;
	private LoginView loginView;
	
	public LoginController(LoginModel loginModel, LoginView loginView) {
		this.loginModel = loginModel;
		this.loginView = loginView;
	}
	// control()
	public void control() {
		loginView.getLogarButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Apertei");
		String login = loginView.getCampoLogin().getText();
		int senha = Integer.parseInt(loginView.getCampoSenha().getText());
		Funcionario funcionario = new Funcionario(login,"default",senha);
		
		//metodo o qual vai tentar fazer o "login"
		loginModel.capturarDados(funcionario);
		if(loginModel.funcionario != null) // significa ter logado no sistema
			Mensagem.exibirMensagem("Login efetuado com sucesso","Sucesso");
		else  // siginifica n�o ter logado
			Mensagem.exibirMensagem("Login n�o efetuado com sucesso","Erro");
		
		// afim apenas de a todo tempo que clikar no bot�o login validar todos os usu�rios da base
		loginModel.funcionario = null;
		System.gc();
		
	}
	
}
