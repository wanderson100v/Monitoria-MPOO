package App;

import java.awt.Color;

public class App {
	public static void main(String[] args) {
		
		// dependendo da forma que uma mensagem � passada pode ocorrer a��es difirentes-  sobrecarga
		Cachorro cahorro = new Cachorro(Color.CYAN,'M',false,false);
		cahorro.falar();
		cahorro.falar("n�o sei latir");
		
		// animal responde de maneira diferente para a mesma mensagem atrav�z de polimorfismo de objeto
		Animal animal = new Cachorro(Color.green,'M',false,true);
		animal.falar();
		animal = new Gato(Color.red,'f',true,false);
		animal.falar();
	}
}
