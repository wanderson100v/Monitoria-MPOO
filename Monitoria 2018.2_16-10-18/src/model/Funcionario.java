package model;

public class Funcionario {
	private String nome,funcao;
	private int matricula;
	//private Integer matricula; // wrapper
	public Funcionario(String nome, String funcao, int matricula) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
}
