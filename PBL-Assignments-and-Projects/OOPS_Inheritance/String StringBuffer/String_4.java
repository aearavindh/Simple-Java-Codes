package String_StringBuffer;

import java.util.Scanner;

public class String_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    in.close();
	    int len = st.length();
	    int half = len/2;
	    if(len%2==0)
	    	System.out.println(st.substring(0,half));
	    else
	    	System.out.println("null");

	}

}
