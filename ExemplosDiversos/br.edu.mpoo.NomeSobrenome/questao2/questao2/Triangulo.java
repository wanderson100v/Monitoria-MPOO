package questao2;

import java.util.ArrayList;
import java.util.List;

public class Triangulo {
	private String nome;
	
	public Triangulo(String nome) {
		super();
		this.nome = nome;
		this.pontos2d = new ArrayList<>();
	}

	private List<Ponto2D> pontos2d;
	
	public ArrayList<Double> getCordenadasX(){
		ArrayList<Double> psx = new ArrayList<>();
		for(Ponto2D p : pontos2d)
			psx.add(p.getX());
		return psx;
	}
	
	public double[] getCordenadasY(){
		double psy[] = new double[pontos2d.size()];
		for(int i = 0; i < pontos2d.size() ; i++)
			psy[i] = pontos2d.get(i).getY();
		return psy;
	}

	public List<Ponto2D> getPontos2d() {
		return pontos2d;
	}

	public void setPontos2d(List<Ponto2D> pontos2d) {
		this.pontos2d = pontos2d;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
