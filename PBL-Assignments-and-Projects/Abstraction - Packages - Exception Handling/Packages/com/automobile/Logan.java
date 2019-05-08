package com.automobile;

public class Logan extends Vehicle {
	Logan(){
		super("Logan","1236","Magneto");
	}
     public int speed() {
    	 return 45;
     }
     public int gps() {
    	 System.out.println("Control the gps device");
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
