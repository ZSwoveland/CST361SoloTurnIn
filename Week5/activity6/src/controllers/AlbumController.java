package controllers;



import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;

import beans.Album;
import business.MusicManager;

@ManagedBean
@ViewScoped
@EJB(name = "mgr", lookup = "MusicManager")
public class AlbumController {

	public void onSubmit(Album album) {
		album.getTitle();
		album.getArtist();
		album.getYear();
		album.getNumberTracks();
		
		//MusicManager MM = new MusicManager();
		
		mgr.addAlbum(album);
		
		
	}
	
	public void onFind(Album album) {
		//MusicManager mm = new MusicManager();
		mgr.getAlbum(album);
		
		
	}
	
	
}
