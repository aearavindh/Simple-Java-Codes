package Encapsulation_Abstraction;

class Author{
	String name,email;
	char gender;
	
	Author(){
		name = "Norman Lewis";
		email = "lewisnorman@gmail.com";
		gender = 'M';
	}
}

public class Book {

	String name;
	double price;
	int qtyInStock;
	Author author;
	 
	String auName,auEmail;
	char auGender;
 
	Book(){
		author = new Author();
		this.auName = author.name;
		this.auEmail = author.email;
		this.auGender = author.gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public static void main(String[] args) {
		Book book = new Book();
		book.setName("Word Power Made Easy");
		book.setPrice(480);
		book.setQtyInStock(6);
		System.out.println("Book Name: "+book.getName()+"\nPrice: "+book.getPrice()+"\nQuantity Available: "+book.getQtyInStock()+"\nAuthor Name: "+book.auName+"\nEmail: "+book.auEmail+"\nGender: "+book.auGender+"\n");
	}

}
