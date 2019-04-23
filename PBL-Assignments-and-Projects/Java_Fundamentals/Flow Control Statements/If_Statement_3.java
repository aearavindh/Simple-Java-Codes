package Flow_Control_Statements;

public class If_Statement_3 {

	public static void main(String[] args) {

		int i;
		if (args.length == 0) {
			System.out.println("No Values");
		} else {
			for (i = 0; i < args.length - 1; i++)
				System.out.print(args[i] + " , ");
			System.out.println(args[i]);

		}
	}
}