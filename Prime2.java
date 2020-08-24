package Test;

import java.util.*;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the number ");
		
		int a = s.nextInt();
		
		for (int i = 2 ; i < a ; i ++) {
			if(a%i == 0) {
				System.out.println(" Not a prime ");
				System.exit(0);
		}
			
	}
		System.out.println(" Its a prime");

	}
}
