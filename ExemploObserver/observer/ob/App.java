package ob;

public class App {
	public static void main(String[] args) {
		Paparazzi paparazzi = new Paparazzi();
		Paparazzi paparazzi2 = new Paparazzi();
		Paparazzi paparazzi3 = new Paparazzi();
		Celebridade celebridade = new Celebridade();
		
		celebridade.addObserver(paparazzi);
		celebridade.addObserver(paparazzi2);
		celebridade.addObserver(paparazzi3);
	
		celebridade.agir();
	}
}
