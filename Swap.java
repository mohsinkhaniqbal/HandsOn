package Test;

import java.util.*;

public class Swap {

	public static void main(String[] args) {
		
		Scanner  s = new Scanner(System.in);
		
		System.out.println(" Enter the value of a");
		
		int a = s.nextInt();
		
		System.out.println(" Enter the value of b");
		
		int b = s.nextInt();
		
		System.out.println(" The Entered value of a is " + a + " and b is " + b);
		
		int swap;
		
		swap = a;
		a = b;
		b = swap;
		
		
		System.out.println(" After swap the value of a is " + a + " and b is "+ b);
		
		// TODO Auto-generated method stub

	}

}
