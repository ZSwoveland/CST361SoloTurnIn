package beans;

public class ResponseModel {

	private int status;
	private String message;
	
	public ResponseModel(){
		this.status = 0;
		this.message ="";
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int x) {
		this.status = x;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String x) {
		this.message = x;
	}
}
