package Arrays;

import java.util.Scanner;

public class One_Dimentional_Array_3 {

	public static void main(String[] args) {
		int num, check = 0;
		int[] a = new int[] { 23, 45, 6, 66, 3, 56, 65, 23, 12, 1 };
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the element to be searched: ");
		num = in.nextInt();
		for (int i = 0; i < 10; i++) {
			if (a[i] == num) {
				System.out.println(i);
				check++;
			}
		}
			if (check == 0)
				System.out.println("-1");
			in.close();

		

	}

}
