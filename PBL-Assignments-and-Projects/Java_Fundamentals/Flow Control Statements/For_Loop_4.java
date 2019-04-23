package Flow_Control_Statements;

public class For_Loop_4 {

	public static void main(String[] args) {
		int count;
		for(int i=24;i<57;i++)
		{
		count=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		count++;
		}
		if(count==2)
		System.out.print(i+" ");
		}

	}

}
