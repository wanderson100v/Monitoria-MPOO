package model.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Ponto")
public abstract class Ponto {
	private double x,y;
		
	public Ponto() {
	}
	public Ponto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract String getInformacao();
	
	public abstract double distancia(Ponto point);
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
}
