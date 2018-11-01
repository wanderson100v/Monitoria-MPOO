package model;

import java.util.ArrayList;

public class BasePessoas {
	private ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	/**
	 * Apenas adiciona a base se a pessoa for de maior
	 * @param pessoa
	 * @return true caso a pessoa tenha sido cadastrada, false caso seja de menor e também não foi cadastrada
	 */
	public boolean addPessoa(Pessoa pessoa) {
		if(pessoa.getIdade() >= 18) {
			pessoas.add(pessoa);
			return true;
		}
		return false;
	}
	
}
