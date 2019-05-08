package com.wipro.automobile.ship;

abstract class comp{
	int height;
	int width;
	int breadth;
	
	abstract void details();
}

class comp1 extends comp{
	comp1(){
	  height = 6;
	  width = 7;
	  breadth = 8;
	}
	void details() {
		System.out.println("The dimentions for comp1 are");
		System.out.println(height);
		System.out.println(width);
		System.out.println(breadth);
	}
}
class comp2 extends comp{
	comp2(){
		height = 12;
		width = 7;
		breadth = 8;
	}
	void details() {
		System.out.println("The dimentions for comp2 are");
		System.out.println(height);
		System.out.println(width);
		System.out.println(breadth);
	}
}

public class Compartment {

	public static void main(String[] args) {
		comp1 c1 = new comp1();
		comp2 c2 = new comp2();
		comp c = c1;
		c.details();
        c = c2;
        c.details();
	}

}
