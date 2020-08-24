package Test;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the number ");
		
		int a = s.nextInt();
		
		int flag = 0;
		
		for (int i = a; i>=1;i--) {
			
			if (a%i == 0) {
				flag += 1;
			}
			
		}
		
		if (flag == 2) {
			System.out.println("Its a prime");
		} else {
			System.out.println("Not prime");
		}
	}

}
