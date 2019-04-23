package Flow_Control_Statements;

import java.util.Scanner;

public class While_Loop_1 {

	public static void main(String[] args) {

		int num, rem, rev = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = in.nextInt();
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;

		}
		System.out.println(rev);
		in.close();

	}

}
