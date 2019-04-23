package String_StringBuffer;

import java.util.Scanner;

public class String_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    in.close();
	    StringBuffer s = new StringBuffer(st.substring(0,2));
	    int len = st.length();
	    for(int i = 1; i<len; i++ ) {
	    	s = s.append(st.substring(0,2));
	    }
	    System.out.println(s);
	    	
	}

}
