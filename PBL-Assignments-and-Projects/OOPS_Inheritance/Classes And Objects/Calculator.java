package Classes_And_Objects;

import java.util.Scanner;

public class Calculator {
	
	public static double powerInt(int num1, int num2) {
		return Math.pow((double)num1, (double)num2);
	}
    public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, (double)num2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		in.close();
		double intpow = Calculator.powerInt(n1, n2);
		double doublepow = Calculator.powerDouble(n1, n2);
        System.out.println("powerInt = "+intpow+"\npowerDouble = "+doublepow);
	}

}
