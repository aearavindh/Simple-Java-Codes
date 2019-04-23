package String_StringBuffer;

import java.util.Scanner;

public class String_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    String a = "";
	    String b = "";
	    in.close();
	    int len = st.length();
	    for(int i = 0;i<len;i++) {
	     if(st.charAt(i)==',') {
	    	 a = st.substring(0,i);
	    	 b = st.substring(i+1,len);
	    	 break;
	     }
	     }
	    int lena = a.length();
	    int lenb = b.length();
	    StringBuffer stb = new StringBuffer("");
	    for(int i = 0;i<lena;i++) {
	    	if(b.charAt(0)==a.charAt(i)) {
	    		if((a.substring(i,i+lenb)).equals(b.substring(0,lenb))){
	    			if(i>0)
	    			stb = stb.append(a.charAt(i-1));
	    			if(i<lena-lenb)
	    			stb = stb.append(a.charAt(i+lenb));
	    		}
	    	}
	    }
	    System.out.println(stb);
	}

}
