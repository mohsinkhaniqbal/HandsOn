package Test;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the size of array");
		
		int a = s.nextInt();
		
		int m[] = new int[a];
		
		for (int i = 0; i < a ; i++) {
			System.out.println(" Enter the value for index " + i);
			m[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(m));
		
		System.out.println(" Enter the value to search");
		
		int b = s.nextInt();
		
		for (int i = 0 ; i < a ; i++) {
			
			if(b==m[i]) {
				System.out.println(" The value found at index " + i);
			}
		}
		// TODO Auto-generated method stub

	}

}
