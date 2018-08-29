package questao1;

public class Ponto3D extends Ponto {
	private double z;
	
	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String getInformacao() {
		return "("+getX()+","+getY()+","+z+")";
	}

	@Override
	public double distancia(Ponto point){
		Ponto3D pnew = (Ponto3D) point;
		return  Math.sqrt(Math.pow((super.getX() -point.getX()),2)+ Math.pow((super.getY() - point.getY()),2)+ Math.pow((z - pnew.getZ()),2));
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	

}
