package Test;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to get the factorial");
		
		int a = s.nextInt();
		
		int x = 1;
		
		System.out.println("The factorial of the number is ");
		
		for (int i = a ; i>1 ; i--) {
			
			x = i*x;
			
			System.out.print(i + " * ");
		} 
		
		System.out.print(1 + " = " + x);
	}

}
