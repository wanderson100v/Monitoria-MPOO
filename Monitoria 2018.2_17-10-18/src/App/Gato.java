package App;

import java.awt.Color;

public class Gato extends Animal {
	private boolean manso;

	public Gato(Color cor, char sexo, boolean chifre, boolean manso) {
		super(cor, sexo, chifre);
		this.manso = manso;
	}
	
	@Override
	public void falar() {
		System.out.println("gato mia");
	}
	
	public boolean isManso() {
		return manso;
	}

	public void setManso(boolean manso) {
		this.manso = manso;
	}
		


}
