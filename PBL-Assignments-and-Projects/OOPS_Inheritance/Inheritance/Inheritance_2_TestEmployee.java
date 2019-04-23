package Inheritance;

class Employee extends Inheritance_2_Person{
	int year;
	double annualSalary;
	String insuranceNumber;
	public Employee(String name, int year, double annualSalary, String insuranceNumber) {
		super(name);
		this.year = year;
		this.annualSalary = annualSalary;
		this.insuranceNumber = insuranceNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
}

public class Inheritance_2_TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Ajin",2019,5.2,"4534");
		System.out.println("Name: "+emp.getName()+"\nYear: "+emp.getYear()+"\nSalary: "+emp.getAnnualSalary()+"\nInsurance Number: "+emp.getInsuranceNumber());
	}

}
