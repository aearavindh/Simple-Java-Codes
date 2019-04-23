package String_StringBuffer;

import java.util.Scanner;

public class String_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    in.close();
	    int len = st.length();
	    if(st.charAt(0)=='x' && st.charAt(len-1)=='x')
	    	System.out.println(st.substring(1,len-1));
	    else
	    	System.out.println(st);

	}

}
