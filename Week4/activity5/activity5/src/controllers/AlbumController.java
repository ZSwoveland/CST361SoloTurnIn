package controllers;



import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;

import beans.Album;
import business.MusicManager;

@ManagedBean
@ViewScoped

public class AlbumController {

	public void onSubmit(Album album) {
		album.getTitle();
		album.getArtist();
		album.getYear();
		album.getNumberTracks();
		
		MusicManager MM = new MusicManager();
		
		MM.addAlbum(album);
		
		
	}
	
	public void onFind(Album album) {
		MusicManager mm = new MusicManager();
		mm.getAlbum(album);
		
		
	}
	
	
}
