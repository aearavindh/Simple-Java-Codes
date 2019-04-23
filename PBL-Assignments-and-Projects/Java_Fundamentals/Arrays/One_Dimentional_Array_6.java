package Arrays;

import java.util.Scanner;

public class One_Dimentional_Array_6 {

	public static void main(String[] args) {

		int n, i, j, temp;
		int[] a = new int[50];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		n = in.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			a[i] = in.nextInt();
		}

		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		System.out.println("The Sorted Array is : ");
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");

		in.close();

	}

}
