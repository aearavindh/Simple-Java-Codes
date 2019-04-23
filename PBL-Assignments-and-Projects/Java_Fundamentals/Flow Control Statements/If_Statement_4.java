package Flow_Control_Statements;

import java.util.Scanner;

public class If_Statement_4 {

	public static void main(String[] args) {

		char i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		i = in.next().charAt(0);
		j = in.next().charAt(0);
		if (i > j)
			System.out.println(j + "," + i);
		else
			System.out.println(i + "," + j);

		in.close();
	}

}
