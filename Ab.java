package Test;

public abstract class Ab {
	
	abstract void play();
	abstract void work();
}

class Abc extends Ab{
	
	void play() {
		System.out.println(" Play ");
	}
	
	void work() {
		System.out.println(" Work ");
	}
	
}

