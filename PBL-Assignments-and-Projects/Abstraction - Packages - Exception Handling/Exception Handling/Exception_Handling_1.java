package Exception_Handling;
import java.util.Scanner;
public class Exception_Handling_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
		System.out.print("Enter an integer: ");
		String s = in.next();
		int i = Integer.parseInt(s);
		System.out.println("The square value is "+i*i);
		System.out.println("The work has been done successfully.");
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		in.close();

	}

}
