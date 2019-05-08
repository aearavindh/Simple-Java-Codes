package Exception_Handling;

class InvalidAgeException extends Exception{
	public String toString() {
		return "InvalidAgeException: The age must be between 18-60";
	}
}

public class Exception_Handling_8 {

	public static void main(String[] args) {
		try {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if(age>=18 && age<60)
			System.out.println("Hello "+name+" your age is applicable.");
		else
			throw new InvalidAgeException();
		}
		catch(Exception e) {
			System.out.println(e);
		}
        finally {
        	System.exit(0);
        }
	}

}
