package app;

public class InterfacesXAbstract {
	public static void main(String[] args) {
		//Pessoa p = new Pessoa();
		Pessoa p = new PessoaConcreta(); // polimorfismo de objeto

		IPessoa p2 = new IPessoa() { // a partir de interface
			@Override
			public void fazTal() {
				System.out.println("Estou fazendo...");
			}
		};
		
		Pessoa p3 = new Pessoa() { // a partir de classe abstrata
			@Override
			void fazTal() {
				// TODO Auto-generated method stub
			}
		};
		
		
	}
}

abstract class Pessoa{
	private String nome;
	
	public void fazOutraCoisa() {
		
	}
	
	abstract void fazTal();
}

class PessoaConcreta  extends Pessoa{

	@Override
	public void fazTal() {
		// TODO Auto-generated method stub
		
	}
}

interface IPessoa{
	
	/*default void FalO(){
	}*/
	void fazTal();
}
