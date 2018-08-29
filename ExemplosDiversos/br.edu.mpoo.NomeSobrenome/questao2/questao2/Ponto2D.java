package questao2;

public class Ponto2D extends Ponto {

	
	public Ponto2D(double x, double y, Triangulo triangulo) {
		super(x, y);
		if(triangulo.getPontos2d().size()<3)
			triangulo.getPontos2d().add(this);
	}

	@Override
	public String getInformacao() {
		return  "("+getX()+","+getY()+")";
	}

	@Override
	public double distancia(Ponto point) {
		return  Math.sqrt(Math.pow((super.getX() -point.getX()),2)+ Math.pow((super.getY() - point.getY()),2));
	}
	
	

	
}
