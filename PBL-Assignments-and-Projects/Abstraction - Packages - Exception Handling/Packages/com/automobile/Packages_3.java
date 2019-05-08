package com.automobile;

public class Packages_3 {

	public static void main(String[] args) {
	    Hero hero = new Hero();
	    Honda honda = new Honda();
	    Vehicle vehicle = hero;
	    System.out.println(vehicle.getModelName());
	    System.out.println(vehicle.getRegistrationNumber());
	    System.out.println(vehicle.getOwnerName());
	    System.out.println(hero.getSpeed());
        hero.radio();
        
        vehicle = honda;
        System.out.println(vehicle.getModelName());
	    System.out.println(vehicle.getRegistrationNumber());
	    System.out.println(vehicle.getOwnerName());
	    System.out.println(honda.getSpeed());
	    honda.cdplayer();
	}

}
