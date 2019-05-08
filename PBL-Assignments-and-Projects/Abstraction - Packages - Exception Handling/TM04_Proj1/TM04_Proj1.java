package TM04_Proj1;

import java.util.Scanner;

abstract class Account{
	double interestRate;
	double amount;
	abstract double CalculateInterest();
}
class FDAccount extends Account{
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	FDAccount(double fdAmount, int days, int age){
		this.amount = fdAmount;
		this.noOfDays = days;
		this.ageOfACHolder = age;
	}
	double CalculateInterest() {
		if(amount<10000000) {
			if(ageOfACHolder<65) {
				if(noOfDays>=7 && noOfDays<=14)
					interestRate = 0.045;
				else if(noOfDays>=15 && noOfDays<=29)
					interestRate = 0.0475;
				else if(noOfDays>=30 && noOfDays<45)
					interestRate = 0.055;
			    else if(noOfDays>=45 && noOfDays<=60)
			    	interestRate = 0.07;
			    else if(noOfDays>=61 && noOfDays<=184)
			    	interestRate = 0.075;
			    else if(noOfDays>=185 && noOfDays<=365)
			    	interestRate = 0.08;
			    else
			    	System.out.println("Enter correct number of days.");
			}
			else {
				if(noOfDays>=7 && noOfDays<=14)
					interestRate = 0.05;
				else if(noOfDays>=15 && noOfDays<=29)
					interestRate = 0.0525;
				else if(noOfDays>=30 && noOfDays<45)
					interestRate = 0.06;
			    else if(noOfDays>=45 && noOfDays<=60)
			    	interestRate = 0.075;
			    else if(noOfDays>=61 && noOfDays<=184)
			    	interestRate = 0.08;
			    else if(noOfDays>=185 && noOfDays<=365)
			    	interestRate = 0.085;
			    else
			    	System.out.println("Enter correct number of days.");
			}
		}
		else {
			if(noOfDays>=7 && noOfDays<=14)
				interestRate = 0.065;
			else if(noOfDays>=15 && noOfDays<=29)
				interestRate = 0.0675;
			else if(noOfDays>=30 && noOfDays<45)
				interestRate = 0.0675;
		    else if(noOfDays>=45 && noOfDays<=60)
		    	interestRate = 0.08;
		    else if(noOfDays>=61 && noOfDays<=184)
		    	interestRate = 0.085;
		    else if(noOfDays>=185 && noOfDays<=365)
		    	interestRate = 0.1;
		    else
		    	System.out.println("Enter correct number of days.");
		}
		return amount*interestRate;
	}
}
class SBAccount extends Account{
	double interestRate;
	double amount;
	String accountType;
	SBAccount(double amount,String accountType){
		this.amount = amount;
		this.accountType = accountType;
	}
	double CalculateInterest() {
		if(accountType.equals("Normal"))
			interestRate = 0.04;
		else if(accountType.equals("NRI"))
			interestRate = 0.06;
		return amount*interestRate;
	}
}
class RDAccount extends Account{
	double interestRate;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	int age;
	RDAccount(double rdAmount, double monthlyAmount, int months,int age){
		this.amount = rdAmount;
		this.monthlyAmount = monthlyAmount;
		this.noOfMonths = months;
		this.age = age;
	}
	double CalculateInterest() {
		if(age<65) {
		     switch (noOfMonths) {
			case 6:interestRate = 0.075;
				break;
			case 9:interestRate = 0.0775;
				break;
			case 12:interestRate = 0.08;
				break;
			case 15:interestRate = 0.0825;
				break;
			case 18:interestRate = 0.085;
				break;
			case 21:interestRate = 0.0875;
				break;
			default:System.out.println("Enter correct number of months.");
				break;
			}
		}else {
			switch (noOfMonths) {
			case 6:interestRate = 0.08;
				break;
			case 9:interestRate = 0.0825;
				break;
			case 12:interestRate = 0.0850;
				break;
			case 15:interestRate = 0.0875;
				break;
			case 18:interestRate = 0.09;
				break;
			case 21:interestRate = 0.0925;
				break;
			default:System.out.println("Enter correct number of months.");
				break;
			}
		}
		return amount*interestRate;
	}
}

class NegativeException extends Exception{
	public String toString() {
		return "Invalid Number of days. Please enter non-negative values.";
	}
}
public class TM04_Proj1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ch;
		try {
		while(true) { 
			System.out.println("\nMAIN MENU");
			System.out.println("---------");
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			System.out.print("Enter your option (1..4) :");
			ch = in.nextInt();
			switch(ch) {
			case 1:System.out.print("Enter the Average amount in your account: ");
			       double amount = in.nextDouble();
			       if(amount<0)
			    	   throw new NegativeException();
			       System.out.println("Enter the type of account: ");
			       String accountType = in.next();
				   System.out.println("Interest gained: Rs. "+new SBAccount(amount,accountType).CalculateInterest());
				   break;
			case 2:System.out.print("Enter the FD amount: ");
				   double fdAmount = in.nextDouble();
				   if(fdAmount<0)
			    	   throw new NegativeException();
				   System.out.print("Enter the number of days: ");
				   int days = in.nextInt();
				   if(days<0)
			    	   throw new NegativeException();
				   System.out.print("Enter your age: ");
				   int age = in.nextInt();
				   if(age<0)
			    	   throw new NegativeException();
				   System.out.println("Interest gained: Rs. "+new FDAccount(fdAmount,days,age).CalculateInterest());
				   break;
			case 3:System.out.print("Enter the RD amount: ");
			       double rdAmount = in.nextDouble();
			       if(rdAmount<0)
			    	   throw new NegativeException();
			       System.out.print("Enter the monthly amount: ");
				   double monthlyAmount = in.nextDouble();
				   if(monthlyAmount<0)
			    	   throw new NegativeException();
				   System.out.print("Enter the number of months: ");
				   int months = in.nextInt();
				   if(months<0)
			    	   throw new NegativeException();
				   System.out.print("Enter your age: ");
				   int Age = in.nextInt();
				   if(Age<0)
			    	   throw new NegativeException();
				   System.out.println("Interest gained: Rs. "+new RDAccount(rdAmount,monthlyAmount,months,Age).CalculateInterest());
				   break;
			case 4:System.exit(0);
			default:System.out.println("Please choose the correct option.");
				    break;   
			}
		}

	}catch(Exception e) {
		System.out.println(e);
	}

}
}