package com.automobile;

public class Packages_4 {

	public static void main(String[] args) {
		Logan logan = new Logan();
		Ford ford = new Ford();
	    Vehicle vehicle = logan;
	    System.out.println(vehicle.getModelName());
	    System.out.println(vehicle.getRegistrationNumber());
	    System.out.println(vehicle.getOwnerName());
	    System.out.println(logan.speed());
        logan.gps();
        
        vehicle = ford;
        System.out.println(vehicle.getModelName());
	    System.out.println(vehicle.getRegistrationNumber());
	    System.out.println(vehicle.getOwnerName());
	    System.out.println(ford.speed());
	    ford.tempControl();

	}

}
