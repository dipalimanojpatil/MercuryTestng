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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1 {

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("..BeforeSuite.. For Class ..Test1..");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("..BeforeTest.. For Class ..Test1..");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("..BeforeClass.. For Class ..Test1..");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("..BeforeMethod.. For For Class ..Test1..");
	}

	@Test(priority=1)
	public void TestMethod1() {
		System.out.println("..TestMethod1.. For Class ..Test1..");
	}

	@Test(priority=3)//,dependsOnMethods=("TestMethod1"))
	public void TestMethod2() {
		System.out.println("..TestMethod2.. For Class ..Test1..");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("..AfterMethod.. For Class ..Test1..");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("..AfterClass.. For For Class ..Test1..");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("..AfterTest.. For For Class ..Test1..");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("..AfterSuite.. For For Class ..Test1..");
	}

}
