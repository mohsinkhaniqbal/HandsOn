package Test;

import java.util.*;

public class GCD {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println(" Enter the Smaller value ");
		
		int a = s.nextInt();
	
		System.out.println(" Enter the Higher value ");
		
		int b = s.nextInt();
		
		int c;
		
		
		while(b!=0) {
			
			c = a%b;
			a = b;
			b = c;
			
		}
		
		System.out.println(" The GCD of the given values is " + a);
		
		// TODO Auto-generated method stub

	}

}
