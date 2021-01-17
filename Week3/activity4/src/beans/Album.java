package beans;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




@ManagedBean
@ViewScoped
public class Album {
	@NotNull()
	@Size(min=5,max=50)
	private String title;
	
	@NotNull()
	@Size(min=5,max=25)
	private String artist;
	
	@Min(1920)
	@Max(2020)
	private int year;
	

	private List<Track> tracks;
	
	public Album() {
		this.title = "";
		this.artist = "";
		this.year = 0;
		this.tracks.add(null);
		
	}
	
	public void setTitle(String x) {
		this.title = x;
	}
	
	public void setArtist(String x) {
		this.artist = x;
	}
	
	public void setYear(int x) {
		this.year = x;
	}
	public void setTracks(Track x) {
		this.tracks.add(x);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public List<Track> getTracks(){
		return this.tracks;
	}
	
	public int getNumberTracks() {
		return this.tracks.size();
	}

}
