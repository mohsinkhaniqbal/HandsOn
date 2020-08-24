package Test;

import java.util.*;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the number ");
		
		int a = s.nextInt();
		
		System.out.println(" The Even number's are ");
		
		for (int i = 1; i <= a ; i++) {
			
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
