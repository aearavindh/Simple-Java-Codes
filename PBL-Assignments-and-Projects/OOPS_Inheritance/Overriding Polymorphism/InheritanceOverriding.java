package Overriding_Polymorphism;

class Fruit{
	String name,taste;
	int size;
	public void eat() {
		System.out.println("Fruits taste differently");
	}
}
class Apple extends Fruit {
	Apple(){
		this.taste = "sweet";
		this.name = "Apple";
	}
	public void eat() {
		System.out.println(name+" tastes "+taste);
	}
}
class Orange extends Fruit{
	Orange(){
		this.taste = "sour and sweet";
		this.name = "Orange";
	}
	public void eat() {
		System.out.println(name+" tastes "+taste);
	}
}
public class InheritanceOverriding {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		Apple a = new Apple();
		Orange o = new Orange();
		f = a;
		f.eat();
		f = o;
		f.eat();

	}

}
