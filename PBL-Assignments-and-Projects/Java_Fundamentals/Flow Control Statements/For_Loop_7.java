package Flow_Control_Statements;

public class For_Loop_7 {

	public static void main(String[] args) {

		int num;
		if (args.length == 0)
			System.out.println("Please enter an integer");
		else {
			num = Integer.parseInt(args[0]);

			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print(" * ");
				System.out.println(" ");
			}

		}
	}

}
