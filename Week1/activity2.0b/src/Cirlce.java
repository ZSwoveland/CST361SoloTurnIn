
public class Cirlce implements Shape {
	
	//was a little lost in this portion of the class
	//I created the standard x y color to make circles
	//I did not do radius for circle because of the random generator could not find a simple formula to replicate in code with using x and y
	
	public int x;
	public int y;
	public int radius;
	public String color;

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y = y;
	}

	@Override
	public void setRadius(int r) {
		// TODO Auto-generated method stub
		this.radius = r;
	}

	@Override
	public void setColor(String c) {
		// TODO Auto-generated method stub
		this.color = c;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return this.radius;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	
	public void  draw() {
		
	    System.out.println("Drawing a Circle with current parameters");
		System.out.println("Current x is " + Integer.toString(getX()));
		System.out.println("Current y is " + Integer.toString(getY()));
		//System.out.println("Current radius is "+ Integer.toString(getRadius()));
		System.out.println("Current color is " + getColor());
	}
	
	public void createCircle(int x, int y, String c) {
		
		setX(x);
		setY(y);
		setColor(c);
		//draw();
		
	}
	
	



}
