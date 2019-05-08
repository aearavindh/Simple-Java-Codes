package Exception_Handling;

public class Exception_Handling_4_MathOperation {
	public static void main(String[] args) throws ArithmeticException,NumberFormatException {
		int[] a = new int[5];
		int i;
		try {
		for(i=0;i<5;i++)
			a[i] = Integer.parseInt(args[i]);
        float sum = 0;
        for(i=0;i<5;i++)
        	sum+=a[i];
        System.out.println("Sum is "+sum+"\nAverage is "+sum/5);
		}
        catch(Exception e) {
    		System.out.println(e);
    	}   
	}
}
