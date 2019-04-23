package Flow_Control_Statements;

import java.util.Scanner;

public class If_Statement_7 {

	public static void main(String[] args) {
		
		char ch;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character variable: ");
		ch = in.next().charAt(0);
		
		if(ch>=65 && ch<=90)
			System.out.println(ch+"->"+(char)(ch+32));
		else if(ch>=97 && ch<=122)
			System.out.println(ch+"->"+(char)(ch-32));
		else
			System.out.println("The entered character is not an alphabet");
		in.close();

	}

}
