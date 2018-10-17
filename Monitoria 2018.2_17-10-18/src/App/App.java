package App;

import java.awt.Color;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		// dependendo da forma que uma mensagem é passada pode ocorrer ações difirentes-  sobrecarga
		Cachorro cahorro = new Cachorro(Color.CYAN,'M',false,false);
		cahorro.falar();
		cahorro.falar("não sei latir");
		
		// animal responde de maneira diferente para a mesma mensagem atravéz de polimorfismo de objeto
		Animal animal = new Cachorro(Color.green,'M',false,true);
		animal.falar();
		animal = new Gato(Color.red,'f',true,false);
		animal.falar();
		
		// arraylist e polimorfismo de objeto
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(cahorro);
		animais.add(new Bode());
		animais.add(new Vaca());
		animais.add(new Bode());
		animais.add(new Vaca());
		animais.add(new Bode());
		animais.add(new Bode());
		
		System.out.println("\nMinha fazenda:");
		for(Animal a : animais) {
			a.falar();
		}
		
		
		
		
	}
}
