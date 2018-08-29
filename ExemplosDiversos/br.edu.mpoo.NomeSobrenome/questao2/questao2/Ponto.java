package questao2;

public abstract class Ponto {
	private double x,y;

	
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
