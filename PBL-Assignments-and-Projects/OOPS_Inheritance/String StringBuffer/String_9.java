package String_StringBuffer;

import java.util.Scanner;

public class String_9 {

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
	     StringBuffer stb = new StringBuffer();
	     stb = stb.append(a.charAt(0));
	     stb = stb.append(b.charAt(0));
	     int lena = a.length();
	     int lenb = b.length();
	     if(lena>lenb) {
	     for(int i = 1;i<lena;i++) {
	    	 stb = stb.append(a.charAt(i));
	    	 if(i<lenb)
	    	 stb = stb.append(b.charAt(i));
	     }
	     }else{
	    	 for(int i = 1;i<lenb;i++) {
	    		 if(i<lena)
		    	 stb = stb.append(a.charAt(i));
		    	 stb = stb.append(b.charAt(i));
		     }
	    	
	    	 
	}
	     System.out.println(stb);
	}
}
