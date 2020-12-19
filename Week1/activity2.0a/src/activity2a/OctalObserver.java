package activity2a;

public class OctalObserver extends Observer {

	//default constructor
	public OctalObserver() {
		
	}
	
	//non default constructor
	public OctalObserver(Subject s) {
		this.subject = s;
		s.attach(this);
	}
	
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
		System.out.println(" " + Integer.toOctalString(subject.getState()));
	}

}
