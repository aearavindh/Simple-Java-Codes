package TM05_Proj2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FDAccountTest {

	@Test
	public void testCalculateInterest() {
		double fdAmount = 10000;
		int days = 60;
		int age = 65;
		assertEquals((int)750.0,(int)new FDAccount(fdAmount,days,age).CalculateInterest());
	}


}
