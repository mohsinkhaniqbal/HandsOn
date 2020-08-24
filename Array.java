package Test;

import java.util.Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		
		int a = s.nextInt();
		
		int marks[] = new int[a];
		
		int num[] = {3,2,1};
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		
		System.out.println("Enter the marks of students");
		
		for (int i = 0; i<a; i++) {
			
			marks[i] = s.nextInt();
		}
		System.out.println("The marks in reverse order");
		
		for (int j = a-1; j>=0; j--) {

			System.out.println(marks[j]);
		}
	}

}
