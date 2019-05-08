package Exception_Handling;
import java.util.Scanner;

class InvalidCountryException extends Exception{
	

	public String toString() {
		return "InvalidCountryException: User outside India cannot be registered.";
	}
}

public class Exception_Handling_7_UserRegistration {

	
	void registerUser(String userName, String userCountry) throws InvalidCountryException {
  	  if(userCountry.equals("India"))
  		  System.out.println("User registration done successfully.");
  	  else
  		  throw new InvalidCountryException();
    }

	public static void main(String[] args) {
          try {
        	 Scanner in = new Scanner(System.in);
        	 System.out.print("Enter the UserName: ");
        	 String name = in.next();
        	 System.out.print("Enter the UserCountry: ");
        	 String country = in.next();
        	 Exception_Handling_7_UserRegistration ob = new Exception_Handling_7_UserRegistration();
        	 ob.registerUser(name, country);
        	 in.close();
          }
          catch(Exception e) {
        	  System.out.println(e);
          }
	}

}