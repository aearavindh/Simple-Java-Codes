package Interfaces;

interface LibraryUser{
	void registerAccount();
	void requestBook();
}

class KidUser implements LibraryUser{
	
	int age;
	String bookType;
	
	KidUser(int age, String bookType){
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		if(age<12)
			System.out.println("You have successfully registered under a Kids Account.");
		else 
			System.out.println("Sorry, Age must be less than 12 to registered as a kid.");
	}
	public void requestBook() {
		if(bookType.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days.");
		else
			System.out.println("Oops, you are allowed to take only kids books.");
	}
	
}
class AdultUser implements LibraryUser{
	
	int age;
	String bookType;
	
	AdultUser(int age, String bookType){
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		if(age>12)
			System.out.println("You have successfully registered under an Adult Account.");
		else 
			System.out.println("Sorry, Age must be greater than 12 to registered as an adult.");
	}
	public void requestBook() {
		if(bookType.equals("Fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
	}

	
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser k = new KidUser(10,"Kids");
		AdultUser a = new AdultUser(10,"Kids");
		LibraryUser l = k;
		l.registerAccount();
		l.requestBook();
		l = a;
		l.registerAccount();
		l.requestBook();
		k = new KidUser(15,"Fiction");
	    a = new AdultUser(15,"Fiction");
	    l = k;
		l.registerAccount();
		l.requestBook();
		l = a;
		l.registerAccount();
		l.requestBook();
	}

}
