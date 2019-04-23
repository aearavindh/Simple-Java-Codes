package Flow_Control_Statements;

import java.util.Scanner;

public class If_Statement_1 {

	public static void main(String[] args) {
		
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = in.nextInt();
		if(number>0)
        System.out.println(number+" is a positive number");
		else if(number<0)
		System.out.println(number+" is a negative number");
		else
		System.out.println(number+" is zero");
		in.close();
	}

}
