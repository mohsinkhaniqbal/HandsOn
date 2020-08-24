package Test;

import java.util.*;

public class ArrayCopy {

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
		
		int n[] = new int[a];
		
		for (int i = 0; i<a ; i++) {
			n[i] = m[i];
		}
		System.out.println(" Copied Array ");
		System.out.println(Arrays.toString(n));

		// TODO Auto-generated method stub

	}

}
