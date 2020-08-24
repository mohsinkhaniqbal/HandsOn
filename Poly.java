package Test;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pol p;
		
		/*Home h = new Home();
		Office o = new Office();
		
		p = h;
		
		p.job();
		p.fun();
		((Home)(p)).home();
		
		p = o;
		
		p.job();
		p.fun();
		((Office)(p)).office();
		*/
		
		/* h.job();
		h.fun();
		h.home();
		*/
		
		Home h = new Home();
		Office o = new Office();
		Poly p = new Poly();
		
		p.abc(h);
		p.abc(o);
			
	}

	void abc(Pol x){
		x.job();
		x.fun();
		
		
	}
}
