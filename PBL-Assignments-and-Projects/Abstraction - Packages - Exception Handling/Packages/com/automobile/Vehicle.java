package com.automobile;

abstract class Vehicle{
	String modelName,registrationNumber,ownerName;
	Vehicle(String a,String b,String c){
		this.modelName = a;
		this.registrationNumber = b;
		this.ownerName = c;
	}
	public abstract String getModelName();
	public abstract String getRegistrationNumber();
	public abstract String getOwnerName();
}

