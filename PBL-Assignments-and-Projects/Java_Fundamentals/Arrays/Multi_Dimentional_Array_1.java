package Arrays;

public class Multi_Dimentional_Array_1 {

	public static void main(String[] args) {
		
		if(args.length!=4)
			System.out.println("Please enter 4 integer numbers");
		else {
			int i,j;
			int[][] a = new int[][] {{Integer.parseInt(args[0]),Integer.parseInt(args[1])},{Integer.parseInt(args[2]),Integer.parseInt(args[3])}};
			System.out.println("The given array is : \n");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("\nThe reverse of the array is : \n");
			for (i = 1; i >= 0; i--) {
				for (j = 1; j >= 0; j--) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
			

	}

}
