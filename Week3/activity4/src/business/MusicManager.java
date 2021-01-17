package business;

import beans.Album;
import beans.Track;
import util.TracksNotFoundException;

import java.util.HashMap;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MusicManager
 */
@Stateless
@Local(MusicManagerInterface.class)
@LocalBean
public class MusicManager implements MusicManagerInterface {

    /**
     * Default constructor. 
     */
    public MusicManager() {
        // TODO Auto-generated constructor stub
    }

    
    private List<Track> getTracks(Album album) throws TracksNotFoundException{
    	
    	HashMap<String,List<Track>> TrackMap = new HashMap<String,List<Track>>();
    	
    	TrackMap.put(album.getArtist()+album.getTitle()+album.getYear(), album.getTracks());
    	
    	for (List<Track> i : TrackMap.values()) {
    		  System.out.println(i);
    		}
    	
    	return album.getTracks();
    	
    	
    }
    
	/**
     * @see MusicManagerInterface#addAlbum(Album)
     */
    public Album addAlbum(Album model) {
        // TODO Auto-generated method stub
    	
    	getTracks(model);
    	
    	
			return null;
    }
    
    

}
