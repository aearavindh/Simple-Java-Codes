package Flow_Control_Statements;

public class For_Loop_5 {

	public static void main(String[] args) {
		int num;
		int count = 0;
		if (args.length == 0)
			System.out.println("Please enter an integer number");
		else {
			num = Integer.parseInt(args[0]);

			if (num == 0 || num == 1)
				System.out.println(num + " is neither prime nor composite");
			else {
				for (int i = 1; i <= num; i++) {
					if (num % i == 0)
						count++;
				}
				if (count == 2)
					System.out.println(num + " is a prime number");
				else
					System.out.println(num + " is not a prime number");

			}
		}
	}
}
