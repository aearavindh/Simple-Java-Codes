package Classes_And_Objects;

import java.util.Scanner;

public class Patient {

	String patientName;
	double height, weight;
	Patient(String pName, double h, double w){
		this.patientName = pName;
		this.height = h;
		this.weight = w;
	}
	public double computeBMI() {
		return weight/(height*height);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pName = in.nextLine();
		double h = in.nextDouble();
		double w = in.nextDouble();
		in.close();
		Patient patient = new Patient(pName,h,w);
		double bmi = patient.computeBMI();
		System.out.println(pName+"'s BMI is +"+bmi);
	}

}
