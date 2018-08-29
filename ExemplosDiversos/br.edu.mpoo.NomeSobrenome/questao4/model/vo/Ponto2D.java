package model.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Ponto2D")
public class Ponto2D extends Ponto {

	public Ponto2D() {
	}
	
	public Ponto2D(double x, double y) {
		super(x, y);
	}

	@Override
	public String getInformacao() {
		return getX()+","+getY()+"\n";
	}
	@Override
	public String toString() {
		return getInformacao();
	}

	@Override
	public double distancia(Ponto point) {
		return  Math.sqrt(Math.pow((super.getX() -point.getX()),2)+ Math.pow((super.getY() - point.getY()),2));
	}
	
	

	
}
