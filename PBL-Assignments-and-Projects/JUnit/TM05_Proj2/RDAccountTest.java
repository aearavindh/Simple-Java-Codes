package TM05_Proj2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

	@Test
	public void testCalculateInterest() {
		double rdAmount = 10000;
		double monthlyAmount = 2000;
		int months = 9;
		int Age = 34;
		assertEquals((int)775.0,(int)new RDAccount(rdAmount,monthlyAmount,months,Age).CalculateInterest());
	}


}
