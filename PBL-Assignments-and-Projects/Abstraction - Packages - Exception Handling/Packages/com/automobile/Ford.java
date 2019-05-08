package com.automobile;

public class Ford extends Vehicle {
	Ford(){
		super("Ford","1235","Arya Stark");
	}
     public int speed() {
    	 return 60;
     }
     public int tempControl() {
    	 System.out.println("Control the air conditioning device");
    	 return 100;
     }
	public String getModelName() {
		
		return modelName;
	}
	public String getRegistrationNumber() {
		
		return registrationNumber;
	}

	public String getOwnerName() {
		
		return ownerName;
	}
}
