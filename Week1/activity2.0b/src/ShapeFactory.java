/**
 * 
 */

/**
 * @author zachs
 *
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ShapeFactory {

	//key is # value is color
	HashMap<Integer,Cirlce> circles = new HashMap<Integer,Cirlce>(); 
	
	
	public void getCircle(int x) {
		//gets the interator over the HashMap
		Iterator<Map.Entry<Integer,Cirlce>> iterator = circles.entrySet().iterator();
		
		//sets boolean to help with finding if on hashmap
		boolean keyPresent = false;
		//checks if # is in the key portion of hashmap
		 while (iterator.hasNext()) { 
			  
	            // Get the entry at this iteration 
	            Map.Entry<Integer, Cirlce> 
	                entry 
	                = iterator.next(); 
	  
	            // Check if this key is the required key 
	            if (x == entry.getKey()) { 
	  
	                keyPresent = true; 
	            } 
			}
		//if key is found draw the circle
		if(keyPresent == true) { 
			//key is going to be # value
			System.out.print(circles.get(x)+"\n");
			circles.get(x).draw();
		}
		//if key is not found already make circle and add it to hashmap
		//user should be able to find it in the hashmap if typed again in the same program runtime
		else {
			//create new instance of cirlce
			System.out.println("Create new instance of Circle");
			Cirlce c = new Cirlce();
			
			c.createCircle(x, x, "Purple");
			
			AddtoHashMap(x,c);
			
			c.draw();
		}
		
	
		
	}
		
	public void  AddtoHashMap(int x, Cirlce c) {
		
			//add circle to hashmap
			circles.put(x, c);
		
		
		
	}
	
	
}
