package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Funcionario;
import model.LoginModel;
import view.LoginView;
import view.Mensagem;

/**
 * Controller é responsavel por intermediar relações entre modelo e visão, e como a visão vai agir 
 * a determinada ação do usuario(eventos) 
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
		else  // siginifica não ter logado
			Mensagem.exibirMensagem("Login não efetuado com sucesso","Erro");
		
		// afim apenas de a todo tempo que clikar no botão login validar todos os usuários da base
		loginModel.funcionario = null;
		System.gc();
		
	}
	
}
