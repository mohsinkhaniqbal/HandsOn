import java.util.*;

class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classes");
		int a = sc.nextInt();
		System.out.println("Enter the number of Students");
		int b = sc.nextInt();
		int max = 0;
	
		int c[][] = new int[a][b];
		int e[] = new int[a];
		
		for(int i=0; i<a;i++) {
			for(int j =0; j<b;j++) {
				System.out.println("Enter the marks of class " + i + " and student " + j);
				c[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("The matrix is");
		
		for(int i=0; i<a;i++) {
			for(int j =0; j<b;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(int i=0; i<a;i++) {
			int d = 0;
			for(int j =0; j<b;j++) {

				d = d+ c[i][j];
			}
			d = d/b;
			System.out.println("The Average of class " + i + " is ");
			System.out.println(d);
			e[i] = d;
		}

		for(int i =0; i<a ; i++) {
			
				if(e[i]>max) {
					max = e[i];
				}
				}
			
		for(int i =0; i<a ; i++) {
			
			if(max==e[i]) {
				System.out.println("The highest average is of class " + i + " which is " + max);
				
			}
			}
		


			}

		

	}


