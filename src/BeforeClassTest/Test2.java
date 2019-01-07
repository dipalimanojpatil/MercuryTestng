package BeforeClassTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test2 {

	@BeforeTest
	public void beforeTest() {
		System.out.println("..BeforeTest.. For Class ..Test2..");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("..BeforeClass.. For Class ..Test2..");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("..BeforeMethod.. For For Class ..Test2..");
	}

	@Test(priority = 2)
	public void TestMethod1() {
		System.out.println("..TestMethod1.. For For Class ..Test2..");
	}

	@Test(priority = 4)
	public void TestMethod2() {
		System.out.println("..TestMethod2.. For For Class ..Test2..");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("..AfterMethod.. For For Class ..Test2..");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("..AfterClass.. For For Class ..Test2..");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("..AfterTest.. For For Class ..Test2..");
	}

}
