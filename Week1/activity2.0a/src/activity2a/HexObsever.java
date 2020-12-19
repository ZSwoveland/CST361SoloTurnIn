package activity2a;

public class HexObsever extends Observer{

	
	//default constructor
	public HexObsever(){
		
	}
	
	//non default constructor
	public HexObsever(Subject s) {
		this.subject = s;
		s.attach(this);
	}
	
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
		System.out.println(" " + Integer.toHexString(subject.getState()));
	}

}
