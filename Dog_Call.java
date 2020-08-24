package Test;
import java.util.Scanner;
public class Dog_Call {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Entee value of x");
	

	int x = sc.nextInt();
	Dog d =	new Dog();
	System.out.println(d.a);
	d.bark();
	d.sleep();
	
	System.out.println(x);
	
	}

}
