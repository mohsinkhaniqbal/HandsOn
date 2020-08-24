package Test;

public class Sta {
	
	static int a=0;
	
	static	
	{
		System.out.println("Control inside static");
	}
	
	{
		a++;
		System.out.println("Control inside non-static");
		System.out.println(" The number of objects are " + a);
	}
	
	Sta(){
		System.out.println("Control inside constructor");
	}

}
