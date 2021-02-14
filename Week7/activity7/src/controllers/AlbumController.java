package controllers;



import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.event.NamedEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.interceptor.Interceptors;

import beans.Album;
import business.MusicManager;
import data.LoggingInterceptor;

@Named
@ViewScoped
@Interceptors(LoggingInterceptor.class)
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
