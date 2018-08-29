package questao2;

import javax.swing.JOptionPane;

public class Geometria {
	
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("retângulo");
		
		Ponto2D p1 = new Ponto2D(3.0,1.3, triangulo);
		Ponto2D p2 = new Ponto2D(2.5,1.6, triangulo);
		Ponto2D p3 = new Ponto2D(8.2, 6.2, triangulo);
		
		double psy[] = triangulo.getCordenadasY();
		String saida = "[";
		for(double value :psy )
			saida+=value+",";
		saida+="]";
		JOptionPane.showMessageDialog(null,"triangulo de nome\n"+triangulo.getNome()+"pontos x"+triangulo.getCordenadasX() +"\npontos y"+saida);
		
	}
}
