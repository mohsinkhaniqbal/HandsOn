package Test;

public class MethodOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal c = new Cal();
		
		int p = c.sum(1,2);
		double q = c.sum(2,5,6);
		double r = c.sum(5,0.5);
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}

}
