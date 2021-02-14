package business;

import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import beans.Album;
import data.LoggingInterceptor;

/**
 * Session Bean implementation class Cache
 */
@Stateless
@LocalBean
@Startup
@Singleton
@Interceptors(LoggingInterceptor.class)
public class Cache {

	private HashMap<String, Album>cache;
    /**
     * Default constructor. 
     */
    public Cache() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    public void init() {
    	this.cache = new HashMap<>();
    }
    
    public  Album getObject(Album album) {
    	
    	if(cache.get(album) == album) {
    		System.out.println("Returning exact match album searched for");
    		return cache.get(album);
    	}
    	
    	else {
    		System.out.println("Unable to find album searched for");
    		return cache.get(album);
    	}
    	
    	
    	
    }
    
    public void  putObject(Album album) {
    	String x = "";
    	int y = 0;
    	x += y;
    	cache.put(x, album);
    	System.out.println(cache.put(x,album));
    	
    	
    	
    }

}
