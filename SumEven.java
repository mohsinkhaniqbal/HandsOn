package Test;

import java.util.*;

public class SumEven {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println( " Enter the number ");
		
		int a = s.nextInt();
		
		int sum =0;
		
		for (int i = 1; i<=a; i++) {
			if (i%2 == 0 ) {
				sum = sum+i;
			}
		}
		// TODO Auto-generated method stub

		System.out.println(" The sum of the given even numbers is " + sum);
	}

}
