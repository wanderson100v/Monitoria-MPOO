package ob;

import java.util.Observable;

public class Celebridade extends Observable{
	
	public void agir() {
		System.out.println("celebridade agindo");
		setChanged();
		notifyObservers();
	}
}
