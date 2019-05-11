package Assert_methods_and_annotations;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 ob = new Demo2();
		assertEquals(true,ob.palindromeCheck("malayalam"));
	}

}
