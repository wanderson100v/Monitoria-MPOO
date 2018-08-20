package ob;

import java.util.Observable;
import java.util.Observer;

public class Paparazzi implements Observer{
	
	
	public void tirarFoto(){
		System.out.println("Clik");
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		tirarFoto();
	}

}
