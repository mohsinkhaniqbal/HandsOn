package Test;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Mohsin Khan Iqbal";
		
		String[] sa = s.split(" ");
		
		System.out.println(sa.length);
		
		for (int i=0; i<sa.length;i++) {
			System.out.println(sa[i]);
		}
		
	}

}
