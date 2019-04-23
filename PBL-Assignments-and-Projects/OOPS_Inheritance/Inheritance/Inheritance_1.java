package Inheritance;

class Animal{
	void eat() {
		System.out.println("Animals eat");
	}
	void sleep() {
		System.out.println("Animals sleep");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Birds eat");
	}
	void sleep() {
		System.out.println("Birds sleep");
	}
	void fly() {
		System.out.println("Birds fly");
	}
}

public class Inheritance_1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
	}

}
