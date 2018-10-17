package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Funcionario> funcionarios  = new ArrayList<Funcionario>();
	
	/**
	 * Regra de negocio para inserção na base dada como exemplo
	 * @param funcionario
	 * @return true caso a quantidade de funcionarios seja menor que 10
	 */
	public static boolean addFuncionario(Funcionario funcionario) {
		if(funcionarios.size() <10) {
			funcionarios.add(funcionario);
			return true;
		}
		return false;
	}
	/*
	//Ex.
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios  = new ArrayList<Funcionario>();
		
		//Funcionario funcionario = new Funcionario("wanderson","numsei", 1);
		//Funcionario funcionario2 = new Funcionario("jose","tal", 3);
		
		funcionarios.add(funcionario);
		funcionarios.add(funcionario2);
		
	}*/
	
	public static  ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public static void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		BaseDados.funcionarios = funcionarios;
	}
	
	
}
