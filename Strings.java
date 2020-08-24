package Test;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = new String("Mohsin");
		
		String b = "Khan";
		
		char ch[] = {'I','q','b','a','l'};
		
		String c = new String(ch);
		
		System.out.println(a + " " + b + " " + c);
		
		System.out.println(a.equals(b));
		
		System.out.println(a==b);
		
		System.out.println(a.compareTo(b));
		
		System.out.println(a.length());
		
		System.out.println(a.substring(1,3));
		
		String d = a.intern();
		
		System.out.println(a.equals(d));
		
		System.out.println(a==d);
		
		String e = a.concat(b);
		
		System.out.println(e);
		
		StringBuffer f = new StringBuffer("Java");
		
		System.out.println(f.capacity());
		f.trimToSize();
		
		System.out.println(f.capacity());
		
		f.append("script");
		System.out.println(f);
		
		

	}

}
