package String_StringBuffer;

import java.util.Scanner;

public class String_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    in.close();
	    int len = st.length();
	    System.out.println(st.substring(1,len-1));

	}

}
