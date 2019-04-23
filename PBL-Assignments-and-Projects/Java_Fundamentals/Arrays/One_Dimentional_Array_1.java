package Arrays;

import java.util.Scanner;

public class One_Dimentional_Array_1 {

	public static void main(String[] args) {
		
		int n,i;
		float sum=0;
		int[] a = new int[50];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		n = in.nextInt();
		for(i=0;i<n;i++) {
			System.out.print("Enter element "+(i+1)+": ");
			a[i] = in.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum is "+sum+"\nAverage is "+(sum/n));
		in.close();
	}

}
