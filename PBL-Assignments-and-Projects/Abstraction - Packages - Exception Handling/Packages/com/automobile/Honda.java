package com.automobile;

public class Honda extends Vehicle {
	Honda(){
		super("Honda","1234","Thanos");
	}
	public int getSpeed() {
   	    return 40;
    }
    public void cdplayer() {
   	    System.out.println("Control the cd player device");
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
