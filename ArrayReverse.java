package Test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the size of array");
		
		int a = s.nextInt();
		
		int m[] = new int[a];
		
		for (int i = 0; i < a ; i++) {
			System.out.println(" Enter the value for index " + i);
			m[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(m));
		
		int n[] = new int[a];
		
		int j = a -1 ;
		
		for (int i = 0; i<a ; i++) {
			n[j] = m[i];
			j--;
		}
		
		System.out.println(" The copied revere array is ");
		System.out.println(Arrays.toString(n));
		
		

	}

}
