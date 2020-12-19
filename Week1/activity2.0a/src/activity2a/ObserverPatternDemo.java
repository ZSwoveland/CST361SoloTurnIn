package activity2a;

import java.util.Scanner;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject sub = new Subject();
		
		new HexObsever(sub);
		new BinaryObserver(sub);
		new OctalObserver(sub);
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i<5;i++) {
			System.out.print("\nEnter a Number: ");
			sub.setState(scan.nextInt());
		}
		
		
	}

}
