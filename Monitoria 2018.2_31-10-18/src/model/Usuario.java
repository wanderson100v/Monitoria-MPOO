package model;

public class Usuario extends Pessoa {
	private String login,senha;

	public Usuario(String nome, String email, String endereco, int telefone, int idade, String login, String senha) {
		super(nome, email, endereco, telefone, idade);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
