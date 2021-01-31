package beans;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType()
public class ResponseDataModel {
	
	private Album data;
	
	public ResponseDataModel() {
		this.data = null;
		data.setTracks(null);
	}
	
	public Album getData() {
		return this.data;
	}
	
	public void setData(Album a) {
		this.data = a;
	}

}
