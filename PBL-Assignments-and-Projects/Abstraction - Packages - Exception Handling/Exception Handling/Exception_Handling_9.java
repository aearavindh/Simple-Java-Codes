package Exception_Handling;
import java.util.Scanner;

public class Exception_Handling_9 {

	public static void main(String[] args) {
		try {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 2 numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println("The quotient of "+num1+"/"+num2+" = "+num1/num2);
		in.close();
		}
		catch(ArithmeticException e) {
			System.out.println(e+" exception caught");
		}
	}

}
