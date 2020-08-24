package Test;

import java.util.*;

public class Fibo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" How many Fibonacci numbers do you want ");
		
		int a = s.nextInt();
		
		int fib1 = 0;
		
		int fib2 = 1;
		
		int c;
		
		if(a == 1 ) {
			System.out.println(" The fibonacci numbers are " + fib1);
		} else if (a == 2) {
			System.out.println(" The fibonacci numbers are " + fib1 + " " + fib2);
		} else {
		
			System.out.print(" The fibonacci numbers are " + fib1 + " " + fib2 + " ");
		for (int i = 3 ; i<= a ; i++) {
				c = fib1+fib2;
				fib1 = fib2;
				fib2 = c;
				
				System.out.print(c  +" ");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
