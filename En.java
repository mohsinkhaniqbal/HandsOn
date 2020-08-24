package Test;

public class En {

	private int a = 5000;
	
	/* public void user(int x , String y) {
		if(y == "Moh") {
		System.out.println(" Welcome ");
		a = x;
		} else {
		System.out.println(" Get Lost ");
		}
	} */
	
	/* public En(int x, String y) {
		if(y == "Moh") {
		System.out.println(" Welcome ");
		a = x;
		} else {
		System.out.println(" Get Lost ");
		}
	}*/
	
	public En(int a, String y) {
		if(y == "Moh") {
		System.out.println(" Welcome ");
		this.a = a;
		} else {
		System.out.println(" Get Lost ");
		}
	}
	
	public int balance() {
		return a;
	}
	
	
}
