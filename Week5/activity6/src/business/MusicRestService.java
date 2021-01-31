package business;

import java.util.Set;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import beans.Album;
import beans.ResponseDataModel;


@EJB(name = "service", lookup = "MusicManager") 

public class MusicRestService implements SOAPHandler<SOAPMessageContext> {

	
	@GET
	@Path("/getalbumj/{title}/{artist}/{year}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDataModel getAlbumj(@PathParam("property") String title,@PathParam("property") String artist,@PathParam("property") int year) {
		ResponseDataModel rdm = new ResponseDataModel();
		//MusicManager mm = new MusicManager();
		Album a = new Album(title, artist, year);
		
		service.getAlbum(a);
		
		return rdm;
		
	}
	
	@GET
	@Path("/getalbumx/{title}/{artist}/{year}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDataModel getAlbumx(@PathParam("property") String title,@PathParam("property") String artist,@PathParam("property") int year) {
		ResponseDataModel rdm = new ResponseDataModel();
		//MusicManager mm = new MusicManager();
		Album a = new Album(title, artist, year);
		
		service.getAlbum(a);
		
		return rdm;
		
	}
	
	@Override
	public void close(MessageContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
