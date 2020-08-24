package Test;

public class In {



		int a =5;
		In(){
		System.out.println(a);	
		System.out.println(" In Parent");
		}
	
	}


	
	class Child extends In{
		int b = 10;
		Child(){
			System.out.println(b);	
			System.out.println(" In Child");
		}
	}
	
	

