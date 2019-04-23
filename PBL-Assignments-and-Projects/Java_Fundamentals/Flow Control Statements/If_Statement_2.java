package Flow_Control_Statements;

import java.util.Scanner;

public class If_Statement_2 {

	public static void main(String[] args) {
		
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = in.nextInt();
		if(number%2==0)
        System.out.println(number+" is a even number");
		else
		System.out.println(number+" is an odd number");
		in.close();

	}

}
