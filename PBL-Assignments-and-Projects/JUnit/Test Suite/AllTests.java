package Test_Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Assert_methods_and_annotations.Demo2Test;
import Assert_methods_and_annotations.EmployeeTest;
import Junit_with_Eclipse.Demo1Test;

@RunWith(Suite.class)
@SuiteClasses({ Demo1Test.class, Demo2Test.class, EmployeeTest.class })
public class AllTests {

}
