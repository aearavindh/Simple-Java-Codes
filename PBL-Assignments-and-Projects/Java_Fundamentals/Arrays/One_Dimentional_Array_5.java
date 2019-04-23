package Arrays;

import java.util.Scanner;

public class One_Dimentional_Array_5 {

	public static void main(String[] args) {
		
		int n, i, min1, min2, max1, max2;
		int[] a = new int[50];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		n = in.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			a[i] = in.nextInt();
		}
		min1 = a[0];
		min2 = a[0];
		max1 = a[0];
		max2 = a[0];
		for (i = 0; i < n; i++) {
			if (a[i] < min2) {
				if(a[i] < min1)
				min1 = a[i];
				else
				min2 = a[i];
			}
			if (a[i] > max2) {
				if (a[i] > max1)
				max1 = a[i];
				else
				max2 = a[i];
			}
		}
		System.out.println("Minimum Values are " + min1+","+min2 + "\nMaximum Values are " + max1+","+max2);
		in.close();

	}

}
