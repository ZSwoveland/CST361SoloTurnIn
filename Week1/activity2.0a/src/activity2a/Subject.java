package activity2a;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	
	private List<Observer> oLists = new ArrayList<>();
	private int state;
	
	//default constructor
	public Subject() {
		
	}

	//Makes whatever Observer be able to call the Subject correctly
	public void attach(Observer o) {
		oLists.add(o);
	}
	
	public void setState(int x) {
		this.state = x;
		this.update();
	}
	
	public int getState() {
		return state;
	}
	
	private void update() {
		for(Observer observer : oLists) {
			observer.Update();
		}
	}
	
}
