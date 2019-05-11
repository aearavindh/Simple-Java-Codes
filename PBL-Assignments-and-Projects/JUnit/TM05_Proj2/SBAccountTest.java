package TM05_Proj2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {

	@Test
	public void testCalculateInterest() {
		double amount = 10000;
		String accountType = "Normal";
		assertEquals((int)400.0,(int)new SBAccount(amount,accountType).CalculateInterest());
	}


}
