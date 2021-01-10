package beans;

public class Track {
	
	private String title;
	
	private int number;
	
	public Track() {
		this.title = "";
		this.number = 0;
		
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setTitle(String x) {
		this.title = x;
	}
	
	public void setNumber(int x) {
		this.number = x;
	}

}
