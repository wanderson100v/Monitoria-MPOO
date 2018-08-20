package app;
import java.util.ArrayList;

public class Ob {
	public static void main(String[] args) {
		
		Ladrao ladrao = new Ladrao();
		Policia p = new Policia();
		Policia p2 = new Policia();
		
		ladrao.addObservador(p);
		ladrao.addObservador(p2);
		ladrao.agir();
	}
}
class Policia implements Observador{

	@Override
	public void atualizar(Object o) {
		System.out.println(o +" policial agiu");
	}
	
}
class Ladrao extends Observavel {
	public void agir() {
		System.out.println("Ladrão agi");
		notificarOuvintes("Ladrão agi");
	}
}
abstract class Observavel  {
	ArrayList<Observador> observadores = new ArrayList<>();
	
	public <T extends Observador >void addObservador(T t) {
		observadores.add(t);
	}
	public void notificarOuvintes(Object valor) {
		System.out.println("Nome "+Thread.currentThread().getName());
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Nome "+Thread.currentThread().getName());
				for(Observador e : observadores)
					e.atualizar(valor);
			}
		}).start();
	}
}

interface Observador{
	public void atualizar(Object o);
}

