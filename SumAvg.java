package Test;

import java.util.*;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" How many numbers do you have ?");
		
		int a = s.nextInt();
		
		double sum = 0;
		double avg = 0;
		
		for (int i = 1; i<=a;i++) {
		
		System.out.println(" Enter the numbers ");
		double c = s.nextDouble();
		sum = sum + c;
		avg =  (sum)/i;
				
		}
		
		System.out.println();
		System.out.println("The sum of the entered numbers is " + sum);
		System.out.println("The average of the entered numbers is " + avg);

	}

}
