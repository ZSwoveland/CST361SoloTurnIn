package controllers;



import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;

import beans.Album;

@ManagedBean
@ViewScoped

public class AlbumController {

	public void onSubmit(Album album) {
		album.getTitle();
		album.getArtist();
		album.getYear();
		album.getNumberTracks();
		
		
		
	}
	
}
