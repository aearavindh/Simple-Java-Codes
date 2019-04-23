package Arrays;

import java.util.Scanner;

public class One_Dimentional_Array_7 {

	public static void main(String[] args) {

		int n, i, j, k, l;
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
				if (a[i] == a[j]) {
					l = j;
					for (k = j + 1; k < n; k++, l++) {
						a[l] = a[k];
					}
					n--;
					j--;
				}
			}
		}

		int[] b = new int[n];
		for (i = 0; i < n; i++) {
			b[i] = a[i];
		}

		System.out.println("The Array without duplicate elements is : ");
		for (i = 0; i < n; i++)
			System.out.print(b[i] + " ");

		in.close();

	}

}
