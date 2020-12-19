package activity2a;

public class BinaryObserver extends Observer{

	//default constructor
	public BinaryObserver() {
		
	}
	
	//non default constructor
	public BinaryObserver(Subject s) {
		this.subject = s;
		//Puts this class into subject to execute/update
		s.attach(this);
		
	}
	
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
		System.out.println(" " + Integer.toBinaryString(subject.getState()));
		
	}

	
	
}
