package questao3;

import javax.swing.JOptionPane;

public class Geometria {
	
	public static void main(String[] args) {
		Ponto2D p1 = new Ponto(0.0,0.0);
		Ponto2D p2 = new Ponto(10.0, 0.0);
		
		Ponto3D p3 = new Ponto(0.0,0.0,0.0);
		Ponto3D p4 = new Ponto(10.0,0.0,10.0);
		
		JOptionPane.showMessageDialog(null,"Distancia p1 a p2"+p1.distancia(p2) +"\nDistancia p3 a p4 "+p3.distancia(p4));
		
	}
}
