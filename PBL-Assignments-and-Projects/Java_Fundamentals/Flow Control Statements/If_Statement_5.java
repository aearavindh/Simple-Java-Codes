package Flow_Control_Statements;

import java.util.Scanner;

public class If_Statement_5 {

	public static void main(String[] args) {
		
		char var;
		System.out.println("Enter a character variable: ");
		Scanner in = new Scanner(System.in);
		var = in.next().charAt(0);
		if((var>=65 && var<=90) || (var>=97 && var<=122))
			System.out.println("Alphabet");
		else if(var>=48 && var<=57)
			System.out.println("Digit");
		else 
			System.out.println("Special Character");
		in.close();

	}

}
