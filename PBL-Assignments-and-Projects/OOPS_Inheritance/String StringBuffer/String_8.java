package String_StringBuffer;

import java.util.Scanner;

public class String_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    in.close();
	    int len = st.length();
	    StringBuffer stb = new StringBuffer(st);
	    for(int i = 0;i<len;i++) {
	    	if(stb.charAt(i)=='*') {
	    		System.out.println(stb.delete(i-1, i+2));
	    		break;
	    	}
	    }

	}

}
