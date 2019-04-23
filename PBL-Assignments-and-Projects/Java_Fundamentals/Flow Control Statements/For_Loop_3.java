package Flow_Control_Statements;

import java.util.Scanner;

public class For_Loop_3 {

	public static void main(String[] args) {
		
		int num,i,count=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = in.nextInt();
		for(i=1;i<=num;i++)
		{
		if(num%i==0)
		count++;
		}
		if(count==2)
		System.out.println(num+" is a prime number");
		else
		System.out.println(num+" is not a prime number");

		in.close();
	}

}
