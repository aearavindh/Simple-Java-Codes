package String_StringBuffer;

import java.util.Scanner;

public class String_1_Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = in.nextLine();
		String re ="";
		in.close();
		int len = st.length();
		for(int i = len-1;i>=0;i--)
			re = re + st.charAt(i);
		if(st.equals(re))
			System.out.println(st+" is a palindrome");
		else
			System.out.println(st+" is not a palindrome");

	}

}
