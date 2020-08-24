package Test;

public class Su {
	
	Su(){
		this(1,2);
		System.out.println("No argument super");
	}
	
	Su(int a , int b){
		this(1,2,3);
		System.out.println("Two argument super");
	}
	Su(int a, int b, int c){
		this("sdv");
		System.out.println("Three argument super");
	}
	Su(String s){
		System.out.println("String argument super");
	}

}

class Th extends Su {
	
	Th(){
		this(1,2);
		System.out.println("No argument this");
	}
	
	Th(int a , int b){
		this(1,2,3);
		System.out.println("Two argument this");
	}
	Th(int a, int b, int c){
		this("sdf");
		System.out.println("Three argument this");
	}
	Th(String s){
		System.out.println("String argument this");
	}

}
