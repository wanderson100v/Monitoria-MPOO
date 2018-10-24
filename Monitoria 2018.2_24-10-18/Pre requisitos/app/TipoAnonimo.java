package app;

public class TipoAnonimo {
	public static void main(String[] args) {
		
		
		Humano h = new Humano() {
			@Override
			public void falTal() {
				System.out.println("Sou uma pessoa alta");
			}
		};
		Humano h2 = new Humano() {
			@Override
			public void falTal() {
				System.out.println("Sou uma pessoa baixa");
			}
		};

		Humano h3 = new Humano() {
			@Override
			public void falTal() {
				System.out.println("Sou uma pessoa gorda");
			}
		};

	}
	
}

class Humano{
	public void falTal() {
		System.out.println("Sou uma pessoa");
	}
}

class Velho extends Humano{
	@Override
	public void falTal() {
		System.out.println("Sou uma pessoa velha");
	}
}
