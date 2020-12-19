import java.util.Scanner;

/**
 * 
 */

/**
 * @author zachs
 *
 */
public class FlyweightPatternDemo {

	//array of colors to select from when referenced to random generator
	private static String[] colors = {"Red","Green","Blue","White","Black"} ;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		
		//creates new instances of circle
		Cirlce c = new Cirlce();
		Cirlce c1 = new Cirlce();
		Cirlce c2 = new Cirlce();
		Cirlce c3 = new Cirlce();
		Cirlce c4 = new Cirlce();
		Cirlce c5 = new Cirlce();
		Cirlce c6 = new Cirlce();
		Cirlce c7 = new Cirlce();
		Cirlce c8 = new Cirlce();
		Cirlce c9 = new Cirlce();
		Cirlce c10 = new Cirlce();
		Cirlce c11 = new Cirlce();
		Cirlce c24 = new Cirlce();
		Cirlce c25 = new Cirlce();
		Cirlce c26 = new Cirlce();
		Cirlce c27 = new Cirlce();
		Cirlce c28 = new Cirlce();
		Cirlce c29 = new Cirlce();
		Cirlce c30 = new Cirlce();
		Cirlce c31 = new Cirlce();
		Cirlce c32 = new Cirlce();
		Cirlce c33 = new Cirlce();
		Cirlce c34 = new Cirlce();
		Cirlce c35 = new Cirlce();
		Cirlce c12 = new Cirlce();
		Cirlce c13 = new Cirlce();
		Cirlce c14 = new Cirlce();
		Cirlce c15 = new Cirlce();
		Cirlce c16 = new Cirlce();
		Cirlce c17 = new Cirlce();
		Cirlce c18 = new Cirlce();
		Cirlce c19 = new Cirlce();
		Cirlce c20 = new Cirlce();
		Cirlce c21 = new Cirlce();
		Cirlce c22 = new Cirlce();
		Cirlce c23 = new Cirlce();
		
		//creates new circles
		c.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c1.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c2.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c3.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c4.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c5.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c6.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c7.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c8.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c9.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c10.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c11.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c12.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c13.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c14.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c15.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c16.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c17.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c18.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c19.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c20.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c21.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c22.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c23.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c24.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c25.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c26.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c27.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c28.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c29.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c30.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c31.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c32.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c33.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c34.createCircle(getRandomX(), getRandomY(), getRandomColor());
		c35.createCircle(getRandomX(), getRandomY(), getRandomColor());
		
		//adds everything to hashmap
		sf.AddtoHashMap(0, c);
		sf.AddtoHashMap(1, c);
		sf.AddtoHashMap(2, c);
		sf.AddtoHashMap(3, c);
		sf.AddtoHashMap(4, c);
		sf.AddtoHashMap(5, c);
		sf.AddtoHashMap(6, c);
		sf.AddtoHashMap(7, c);
		sf.AddtoHashMap(8, c);
		sf.AddtoHashMap(9, c);
		sf.AddtoHashMap(10, c);
		sf.AddtoHashMap(11, c);
		sf.AddtoHashMap(12, c);
		sf.AddtoHashMap(13, c);
		sf.AddtoHashMap(14, c);
		sf.AddtoHashMap(15, c);
		sf.AddtoHashMap(16, c);
		sf.AddtoHashMap(17, c);
		sf.AddtoHashMap(18, c);
		sf.AddtoHashMap(19, c);
		sf.AddtoHashMap(20, c);
		sf.AddtoHashMap(21, c);
		sf.AddtoHashMap(22, c);
		sf.AddtoHashMap(23, c);
		sf.AddtoHashMap(24, c);
		sf.AddtoHashMap(25, c);
		sf.AddtoHashMap(26, c);
		sf.AddtoHashMap(27, c);
		sf.AddtoHashMap(28, c);
		sf.AddtoHashMap(29, c);
		sf.AddtoHashMap(30, c);
		sf.AddtoHashMap(31, c);
		sf.AddtoHashMap(32, c);
		sf.AddtoHashMap(33, c);
		sf.AddtoHashMap(34, c);
		sf.AddtoHashMap(35, c);
		System.out.println("System only has 0-35 circles created");
		
		
		Scanner scan = new Scanner(System.in);
		int count = 5;
		//iterates 5 times to test before rerunning program
		for(int i = 0;i<5;i++) {
			
			System.out.println("Please enter an integer to look up in the hashmap for a circle created You have "+ count + " attempts out of 5 before needing to restart program\n");
			//checks what user inputed to verify it is on the hashmap
			int key = scan.nextInt();
			sf.getCircle(key);
			count--;
		}
		
		
		
		
		
		
		
	}
	//sets randomcolor from the array
	private static String getRandomColor() {
		int rColor = (int)(Math.random() * 5);
		
		return colors[rColor];
	}
	
	//sets random # to use
	private static int getRandomX() {
		
		int x = (int)(Math.random()*30);
		
		return x;
	}
	
	//sets random # to use
	private static int getRandomY() {
		int y = (int)(Math.random()*30);
		
		return y;
	}

}
