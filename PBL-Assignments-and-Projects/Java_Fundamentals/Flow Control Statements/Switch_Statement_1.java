package Flow_Control_Statements;

import java.util.Scanner;

public class Switch_Statement_1 {

	public static void main(String[] args) {

		char ch;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a color code character: ");
		ch = in.next().charAt(0);

		switch (ch) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");
			break;
		}
		in.close();

	}

}
