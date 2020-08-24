package Test;

public class RefValue {
	
	public static void main (String args[]) {
	Ref r = new Ref();
	
	System.out.println("The number is " + r.a);
	System.out.println("The char is " + r.b);
	
	Ref c = r;
	
	c.a = 10;
	c.b = 'K';
	
	System.out.println("The updated number is " + c.a);
	System.out.println("The updated char is " + c.b);
	
	
	System.out.println("The updated number also in " + r.a);
	System.out.println("The updated char also in " + r.b);
	
	}
}

class Ref {
	
	int a=5;
	char b='M';
	
	void abc() {
		System.out.println(" The value before updating " + a);
	}
	
	void xyz() {
		System.out.println(" The value before updating " + b);
		
	}
}
