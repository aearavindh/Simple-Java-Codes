package Assert_methods_and_annotations;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class EmployeeTest {

	@Test
	public void testFindName() {
		Employee ob = new Employee();
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Night King");
		aList.add("Thanos");
		assertEquals("FOUND",ob.findName(aList,"Thanos"));
	}

}