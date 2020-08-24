package Test;

import java.util.*;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of Schools");
		
		int a = s.nextInt();
		
		int x[][][] = new int[a][][];
		
		for (int i = 0; i<x.length; i++) {
			System.out.println("Enter the number of classroom in school " + i);
			
			int b = s.nextInt();
			x[i] = new int[b][]; 
		}
		
		for (int i = 0; i<x.length;i++) {
			for (int j = 0 ; j< x[i].length; j++) {
				System.out.println("Enter the number of students in classroom " + j + " of school " + i);
				int c = s.nextInt();
				x[i][j] = new int[c];
			}
		}
		
		for (int i = 0; i<x.length;i++) {
			for (int j = 0 ; j< x[i].length; j++) {
				for (int k=0; k<x[i][j].length;k++) {
					System.out.print(x[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
