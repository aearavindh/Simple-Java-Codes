package String_StringBuffer;

import java.util.Scanner;

public class String_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st1 = in.nextLine();
	    String st2 = in.nextLine();
	    in.close();
        int len1,len2;
        len1 = st1.length();
        len2 = st2.length();
        if(len1<len2)
        	System.out.println(st1+st2+st1);
        else
        	System.out.println(st2+st1+st2);
	}

}
