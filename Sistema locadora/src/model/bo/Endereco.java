package model.bo;

public class Endereco {
	private String bairro,rua,numero;

	public Endereco(String bairro, String rua, String numero) {
		super();
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}

	public Endereco(Cliente cliente) {
		// TODO Auto-generated constructor stub
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
