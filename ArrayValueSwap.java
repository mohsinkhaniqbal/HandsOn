package Test;

import java.util.*;

public class ArrayValueSwap {

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
		// TODO Auto-generated method stub
		
		System.out.println(" Enter the first index to be swapped ");
		
		int b = s.nextInt();
		
		System.out.println(" Enter the second index to be swapped ");
		
		int c = s.nextInt();
		
		int d;
		
		d = m[b];
		m[b] = m[c];
		m[c] = d;
		
		System.out.println(Arrays.toString(m));

	}

}
