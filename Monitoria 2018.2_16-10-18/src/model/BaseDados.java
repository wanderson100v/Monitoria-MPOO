package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Funcionario> funcionarios  = new ArrayList<Funcionario>();
	
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
