package com.automobile;

public class Hero extends Vehicle {
	Hero(){
		super("Hero","1233","Night King");
	}
     public int getSpeed() {
    	 return 45;
     }
     public void radio() {
    	 System.out.println("Control the radio device");
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
