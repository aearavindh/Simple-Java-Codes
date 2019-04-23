package String_StringBuffer;

import java.util.Scanner;

public class String_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    in.close();
	    String s="";
	    int n = 0;
	    int len = st.length();
	    for(int i = 0;i<len;i++) {
	    	 if(st.charAt(i)==',') {
	    		 s = st.substring(0,i);
	    		 n = -48+st.charAt(i+1);
	    		 break;
	     }
	     }
	    int lens = s.length();
	    StringBuffer stb = new StringBuffer();
	    stb = stb.append(s.substring(lens-n,lens));
	    for(int i = 1;i<n;i++)
	    stb = stb.append(s.substring(lens-n,lens));
        System.out.println(stb);
	}

}
