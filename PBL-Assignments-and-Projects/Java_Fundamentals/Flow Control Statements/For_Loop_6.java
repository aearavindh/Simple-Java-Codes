package Flow_Control_Statements;

import java.util.Scanner;

public class For_Loop_6 {

	public static void main(String[] args) {

		int num, rem, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = in.nextInt();
		while (num > 0) {
			rem = num % 10;
			sum += rem;
			num /= 10;

		}
		System.out.println(sum);
		in.close();

	}

}
