package Test;

import java.util.*;

public class Jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of schools");
		
		int a = s.nextInt();
		
		int m[][][]= new int [a][][];

		for (int i =0; i<m.length;i++) {
			
			System.out.println("Enter the number of class room in school " + i);
			int x = s.nextInt();
			
			m[i] = new int[x][];
			
		}
		
		for (int i=0 ; i< m.length;i++) {
			for (int j = 0; j<m[i].length;j++) {
				System.out.println("Enter the number of students in class room " + j + " of school " + i);
				int y = s.nextInt();
				
				m[i][j]= new int[y];
				
			}
		}
		
		for (int i = 0; i<m.length;i++) {
			for (int j = 0; j<m[i].length;j++) {
				for (int k = 0; k<m[i][j].length; k++) {
					System.out.println("Enter the roll of student " + k + " of clssroom " + j + " of school "+ i);
					int z = s.nextInt();
					
					m[i][j][k] = z;
				}
			}
		}
		System.out.println("");
		System.out.println(" The matrix is");
		
		for (int i = 0; i<m.length;i++) {
			for (int j = 0; j<m[i].length;j++) {
				for (int k = 0; k<m[i][j].length; k++) {
					System.out.print(m[i][j][k]+ " ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		
	}
}