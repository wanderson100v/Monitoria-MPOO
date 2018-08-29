package questao3;

public class Ponto implements Ponto2D , Ponto3D {
	private double x,y,z;

	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ponto(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public double distancia(Ponto3D ponto) {
		return Math.sqrt(Math.pow((getX() -ponto.getX()),2)+ Math.pow((getY() - ponto.getY()),2)+ Math.pow((z - ponto.getZ()),2));
	}

	@Override
	public String getInformacao(Ponto3D ponto) {
		return "("+getX()+","+getY()+","+z+")";
	}

	
	@Override
	public double distancia(Ponto2D ponto) {
		return Math.sqrt(Math.pow((getX() - ponto.getX()),2)+ Math.pow((getY() - ponto.getY()),2));
	}

	@Override
	public String getInformacao(Ponto2D ponto) {
		return  "("+getX()+","+getY()+")";
	}

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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	
	
	
}
