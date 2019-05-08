package Exception_Handling;
import java.util.Scanner;

class MyException extends Exception{
	public MyException() {
		System.out.println("MyException thrown...");
	}
	public String toString() {
		return "MyException : Marks must be in the range of 0-100";
	}
}

public class Exception_Handling_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1,s2;
		int[] a1 = new int[3];
		int[] a2 = new int[3];
		int i,sum1 = 0,sum2 = 0;
		try {
		System.out.print("Enter the name of the student 1: ");
		s1 = in.next();
		System.out.println("Enter the marks for 3 subjects: ");
		for(i=0;i<3;i++) {
			a1[i] = in.nextInt();
			if(a1[i]<0 || a1[i]>100)
				throw new MyException();
			sum1+=a1[i];
		}
		System.out.print("Enter the name of the student 2: ");
		s2 = in.next();
		System.out.println("Enter the marks for 3 subjects: ");
		for(i=0;i<3;i++) {
			a2[i] = in.nextInt();
			if(a2[i]<0 || a2[i]>100)
				throw new MyException();
			sum2+=a2[i];
		}
        System.out.println("Average mark for "+s1+" is "+sum1/3);
        System.out.println("Average mark for "+s2+" is "+sum2/3);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			in.close();
		}
	}

}
