package model.bo;

public class Cliente {
	private String nome;
	private Telefone telefone;
	private Endereco endereco;

	public Cliente(String nome) {
		super();
		this.nome = nome;
		this.telefone = new Telefone(this);
		this.endereco = new Endereco(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
