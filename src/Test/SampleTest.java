package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTest {

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Test Suit");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Any Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before ny class");
	}

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before any test method ");
	}
	
	@Test
	public void TestFun() {
		System.out.println("Testing Code");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After any test method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After every class ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After every test belongs to a one class");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after All test are Executed belogs to class");
	}
	

}
