package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.bo.BusinessUsuario;
import br.com.bo.IBusinessUsuario;
import br.com.excecoes.BusinessException;
import br.com.view.Mensagem;
import br.com.view.TelaPrincipal;
import br.com.vo.Usuario;

public class TelaPrincipalController implements ActionListener{
	private TelaPrincipal telaPrincipal;
	private IBusinessUsuario businessUsuario;
	
	public TelaPrincipalController(TelaPrincipal telaPrincipal) {
		super();
		this.telaPrincipal = telaPrincipal;
		this.businessUsuario = new BusinessUsuario();
	}
	
	public void control() {
		telaPrincipal.getLoginView().getConfirmarButton().addActionListener(this);
		telaPrincipal.getLoginView().getSairButton().addActionListener(this);
		telaPrincipal.getLoginView().getCadastrarButton().addActionListener(this);
		telaPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telaPrincipal.getLoginView().getConfirmarButton()
				||e.getSource() == telaPrincipal.getLoginView().getCadastrarButton()) {
			
			String login = telaPrincipal.getLoginView().getLoginField().getText();
			String senha = telaPrincipal.getLoginView().getSenhaField().getText();
			
			try {
				if(e.getSource() == telaPrincipal.getLoginView().getConfirmarButton()) {
					businessUsuario.validarLogin(new Usuario(login, senha));
					Mensagem.imprimirMsg("USUARIO LOGADO COM SUCESSO!");
				}else {
					businessUsuario.cadastrarUsuario(new Usuario(login, senha));
					Mensagem.imprimirMsg("USUARIO CADASTRADO COM SUCESSO!");
				}
			} catch (BusinessException e1) {
				Mensagem.imprimirMsg(e1.getMessage());
			}
				
		}else if(e.getSource() == telaPrincipal.getLoginView().getSairButton()) {
			if(Mensagem.confirmacaoMsg("Deseja realmente sair ?", "Confirmação")==0) 
				System.exit(0);
		}
	}
	
	
}
