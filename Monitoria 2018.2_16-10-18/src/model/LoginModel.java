package model;

public class LoginModel {
	public Funcionario funcionario; // funcionario logado no momento
	
	//set (bazicamente ( pra minha ideia))
	public  void capturarDados(Funcionario funcionario) {
		if(validarDados(funcionario))
			this.funcionario = funcionario;
	}
	
	public boolean validarDados(Funcionario funcionario){
		//for each - analoga python(for elemento in lista:)
		for(Funcionario f : BaseDados.getFuncionarios())
			if(f.getMatricula() == funcionario.getMatricula() 
					&& f.getNome().equalsIgnoreCase(funcionario.getNome()))
				return true;
		return false;
		
	}
	
	public void deslogar() {
		funcionario = null;
		System.gc();
	}
	
}
