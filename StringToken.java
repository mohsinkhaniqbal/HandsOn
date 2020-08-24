package Test;

import java.util.*;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Mohsin Khan Iqbal";
		StringTokenizer sa = new StringTokenizer(s, " ");
		
		while(sa.hasMoreTokens()) {
			System.out.println(sa.nextToken());
		}
		
		
	}

}
