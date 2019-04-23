package Arrays;

public class Multi_Dimentional_Array_2 {

	public static void main(String[] args) {
		
		if(args.length!=9)
			System.out.println("Please enter 9 integer numbers");
		else {
			int i,j,biggest;
			int[][] a = new int[][] {{convert(args[0]),convert(args[1]),convert(args[2])},{convert(args[3]),convert(args[4]),convert(args[5])},{convert(args[6]),convert(args[7]),convert(args[8])}};
			biggest = a[0][0];
			System.out.println("The given array is : \n");
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.print(a[i][j]+" ");
					if(a[i][j] > biggest)
						biggest = a[i][j];
				}
				System.out.println();
			}
			System.out.println("The biggest number in the given array is "+biggest);
			
		}

	}
	public static int convert(String s) {
		int i = Integer.parseInt(s);
		return i;
	}

}

