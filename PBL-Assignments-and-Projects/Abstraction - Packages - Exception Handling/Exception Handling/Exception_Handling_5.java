package Exception_Handling;
import java.util.Scanner;

public class Exception_Handling_5 {

	public static void main(String[] args) throws ArithmeticException {
		Scanner in = new Scanner(System.in);
		try {
		System.out.print("Enter two numbers for division: ");
		int a = in.nextInt();
		int b = in.nextInt();
        System.out.println(a/b);
        in.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
