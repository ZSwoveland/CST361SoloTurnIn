package business;

import beans.Album;
import beans.Track;
import util.TracksNotFoundException;
import data.MusicDataService;

import java.util.HashMap;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

/**
 * Session Bean implementation class MusicManager
 */
@Stateless
@Local(MusicManagerInterface.class)
@LocalBean
@EJB(name = "DAO", lookup = "MusicDataService")
@Alternative
public class MusicManager implements MusicManagerInterface {

    /**
     * Default constructor. 
     */
    public MusicManager() {
        // TODO Auto-generated constructor stub
    }

    //@Inject(TrackFinderInterface tf)
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
    	//MusicDataService mds = new MusicDataService();
    	getTracks(model);
    	DAO.create(model);
    	
    	
			return getAlbum(model);
    }
   
    public Album getAlbum(Album album) {
    	
    	//MusicDataService mds = new MusicDataService();
    	
    	return DAO.findBy(album);
    }
    
    

}
