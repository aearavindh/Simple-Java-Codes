package Exception_Handling;
import java.util.Scanner;

public class Exception_Handling_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
		System.out.println("Enter the number of elements in the array: ");
		int n = in.nextInt();
		System.out.println("Enter the elements in the array: ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		System.out.println("Enter the index of the array element you want to access: ");
		int index = in.nextInt();
		System.out.println("The array element at index "+index+" = "+a[index]);
		System.out.println("The array element successfully accessed.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		in.close();
	}
}
