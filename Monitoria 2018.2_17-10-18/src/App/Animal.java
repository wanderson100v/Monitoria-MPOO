package App;

import java.awt.Color;

/**
 * Classe genêrica
 * @author Wanderson
 *
 */
public class Animal {
	//atributos
	private Color cor;
	private char sexo;
	private boolean chifre ;
	// construtor
	public Animal(Color cor, char sexo, boolean chifre) {
		super();
		this.cor = cor;
		this.sexo = sexo;
		this.chifre = chifre;
	}
	public Animal() {
	}
	
	//metodos
	
	public void falar() {
		System.out.println("Animal falando");
	}
	
	// gets e sets
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isChifre() {
		return chifre;
	}
	public void setChifre(boolean chifre) {
		this.chifre = chifre;
	}
	
	
	
	
}
