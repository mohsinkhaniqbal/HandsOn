package Test;

import java.util.*;

public class SumN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the number ");
		
		int a = s.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i<=a ; i++ ) {
			sum = sum + i;
		}
		
		System.out.println( " The sum of given natural numbers is  " + sum);
		// TODO Auto-generated method stub

	}

}
