import java.awt.Color;

/**
 * 
 */

/**
 * @author zachs
 *
 */
public interface Shape {
	//set the basic methods for shapes here probably did not need radius
	public void setX(int x);
	public void setY(int y);
	public void setRadius(int r);
	public void setColor(String c);
	public int getX();
	public int getY();
	public int getRadius();
	public String getColor();
	public void draw();

}
