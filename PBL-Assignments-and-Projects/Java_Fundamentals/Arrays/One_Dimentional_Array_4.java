package Arrays;

public class One_Dimentional_Array_4 {

	public static void main(String[] args) {
		
		int i;
		int[] a = new int[128];
		for(i=0;i<128;i++) {
			a[i]=i;
		}
		for (i=0;i<128;i++) {
			System.out.print((char)a[i]+" ");
		}

	}

}
