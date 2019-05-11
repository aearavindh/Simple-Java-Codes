package Junit_with_Eclipse;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void testStringConcat() {
		Demo1 ob = new Demo1();
		assertEquals("NightKing",ob.StringConcat("Night", "King"));
	}

}
