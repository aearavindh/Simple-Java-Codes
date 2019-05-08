package Abstract_Classes;

abstract class GeneralBank{
	
	abstract void getSavingsInterestRate();
    abstract void getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	
	void getSavingsInterestRate() {
		System.out.println("Savings Interest Rate is 4%");
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest Rate is 8.5%");
	}
}

class KotMBank extends GeneralBank{
	
    void getSavingsInterestRate() {
    	System.out.println("Savings Interest Rate is 6%");
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest Rate is 9%");
	}
}

public class Abstract_Classes_1 {

	public static void main(String[] args) {
		ICICIBank i = new ICICIBank();
		i.getSavingsInterestRate();
		i.getFixedDepositInterestRate();
		KotMBank k = new KotMBank();
		k.getSavingsInterestRate();
		k.getFixedDepositInterestRate();
		GeneralBank g = new KotMBank();
		g.getSavingsInterestRate();
		g.getFixedDepositInterestRate();
		g = new ICICIBank();
		g.getSavingsInterestRate();
		g.getFixedDepositInterestRate();
	}

}
