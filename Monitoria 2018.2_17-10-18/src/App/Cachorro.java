package App;

import java.awt.Color;

public class Cachorro extends Animal {
	private boolean pelo;

	public Cachorro(Color cor, char sexo, boolean chifre, boolean pelo) {
		super(cor, sexo, chifre);
		this.pelo = pelo;
	}
	
	//sobre escrita
	@Override
	public void falar() {
		System.out.println("Cachorro fala");
	}
	
	//sobre carga
	public void falar(String msg) {
		System.out.println(msg);
	}
	public void falar(String msg,String titulo) {
		System.out.println(titulo+": "+msg);
	}
	
}
