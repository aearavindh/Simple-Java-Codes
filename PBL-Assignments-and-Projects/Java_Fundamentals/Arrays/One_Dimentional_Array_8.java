package Arrays;

import java.util.Scanner;

public class One_Dimentional_Array_8 {

	public static void main(String[] args) {
		
		int n, i,j,start=1000,end=1000,sum = 0;
		int[] a = new int[50];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		n = in.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			a[i] = in.nextInt();
		}
        for(i=0;i<n;i++) {
        	if(a[i]==6) {
        		for(j=i+1;j<n;j++) {
        			if(a[j]==7) {
        				start = i;
        				end = j;
        			}
        				
        		}
        			
        	}
        		
        }
        for(i=0;i<n;i++) {
        	if(i>=start && i<=end)
        		continue;
        	sum+=a[i];
        	
        }
        System.out.print("Sum of the elements with respect to the condition is "+sum);
		in.close();
	}

}
