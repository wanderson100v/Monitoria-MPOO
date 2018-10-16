package model;

public class LoginModel {
	public Funcionario funcionario;
	
	//set (bazicamente ( pra minha ideia))
	public  void capturarDados(Funcionario funcionario) {
		//for each - analoga python(for elemento in lista:
		if(validarDados(funcionario))
			this.funcionario = funcionario;
		
	}
	
	private  boolean validarDados(Funcionario funcionario){
		for(Funcionario f : BaseDados.getFuncionarios()) {
			if(f.getMatricula() == funcionario.getMatricula() 
					&& f.getNome().equalsIgnoreCase(funcionario.getNome())){
				return true;
			}
		}
		return false;
		
	}
	
}
