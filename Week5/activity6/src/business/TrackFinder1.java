package business;

import java.util.HashMap;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.inject.Alternative;

import beans.Album;
import beans.Track;


@EJB
@Alternative
public class TrackFinder1 implements TrackFinderInterface{
	
	public TrackFinder1() {
		
	}

	@Override
	public List<Track> getTracks(Album album) {
	HashMap<String,List<Track>> TrackMap = new HashMap<String,List<Track>>();
    	
    	TrackMap.put(album.getArtist()+album.getTitle()+album.getYear(), album.getTracks());
    	
    	for (List<Track> i : TrackMap.values()) {
    		  System.out.println(i);
    		}
    	
    	return album.getTracks();
	}

}
