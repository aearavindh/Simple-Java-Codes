package Abstract_Classes;

abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
		return "First Class Compartment";
	}
}
class Ladies extends Compartment{
	public String notice() {
		return "Ladies Compartment";
	}
}
class General extends Compartment{
	public String notice() {
		return "General Compartment";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "Luggage Compartment";
	}
}

public class Abstract_Classes_2_TestCompartment {

	public static void main(String[] args) {
		Compartment[] c = new Compartment[10];
		int i;
		for(int j = 0;j<8;j++) {
		i = ((int)(Math.random()*10)%4)+1;
		switch (i) {
		case 1:c[1] = new FirstClass();
	           System.out.println(c[1].notice());
	           break;
	    case 2:c[2] = new Ladies();
	           System.out.println(c[2].notice());
               break;
	    case 3:c[3] = new General();
	           System.out.println(c[3].notice());
	           break;
	    case 4:c[4] = new Luggage();
	           System.out.println(c[4].notice());
               break;
		}
		}
	}

}
