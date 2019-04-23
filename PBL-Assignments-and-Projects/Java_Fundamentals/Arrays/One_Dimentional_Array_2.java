package Arrays;

import java.util.Scanner;

public class One_Dimentional_Array_2 {

	public static void main(String[] args) {

		int n, i, min, max;
		int[] a = new int[50];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		n = in.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			a[i] = in.nextInt();
		}
		min = a[0];
		max = a[0];
		for (i = 0; i < n; i++) {
			if (a[i] < min)
				min = a[i];
			else if (a[i] > max)
				max = a[i];
		}
		System.out.println("Minimum Value is " + min + "\nMaximum Value is " + max);
		in.close();

	}

}
