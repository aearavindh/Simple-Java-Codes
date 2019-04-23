package String_StringBuffer;

import java.util.Scanner;

public class String_2_Concatenation {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     String st = in.nextLine();
	     String st1 = "";
	     String st2 = "";
	     in.close();
	     st = st.toLowerCase();
	     int len = st.length();
	     for(int i = 0;i<=len-1;i++) {
	    	 if(st.charAt(i)==',') {
	    		 st1 = st.substring(0,i);
	    		 if((st.charAt(i-1))==(st.charAt(i+1))) {
	    		 st2 = st.substring(i+2,len); 
	    		 System.out.println(st1+st2);
	    		 }
	    		 else {
	    	     st2 = st.substring(i+1,len);
	    	     System.out.println(st1+" "+st2);
	    		 }
	    		 break;
	     }
	     }
	     

	}

}
