package Flow_Control_Statements;

import java.util.Scanner;

public class While_Loop_2 {

	public static void main(String[] args) {
		
		int num, rem, rev = 0,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = in.nextInt();
		temp = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;

		}
		if(rev==temp) {
			System.out.println(temp+" is a palindrome");
		}else
			System.out.println(temp+" is not a palindrome");
		in.close();

	}

}
