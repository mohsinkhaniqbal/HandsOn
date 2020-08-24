package Test;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter  number to reverse ");;
		
		int a = s.nextInt();
		
		int b  = 0;
		
		int c ;
		
		while (a != 0) {
			
			c = a%10;
			b = b * 10 + c;
			a = a/10;
		}
		
		System.out.println(" The reversed number is " + b);
		// TODO Auto-generated method stub

	}

}
