package br.com.model;

import java.util.Observable;

public class Model extends Observable{
	private String texto;

	public Model(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		setChanged();
		notifyObservers(texto);
		this.texto = texto;
	}
	
}
