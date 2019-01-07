package AssertionsType;
//SoftAssertion on 2 object

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionWith2object {
	
	@Test
	public void SoftTest1()
	{
		
		SoftAssert sa1=new SoftAssert();
		
		sa1.assertEquals(3, 3);
		System.out.println("Sa1---1");
		sa1.assertEquals("Johny", "Johny");
		System.out.println("Sa1---2");
		
		sa1.assertAll();
		
	}
	
	@Test
	public void SoftTest2()
	{

		SoftAssert sa2=new SoftAssert();
		
		sa2.assertEquals(6, 7);
		System.out.println("Sa2---1");
		sa2.assertEquals("Sachin", "Sachin");
		System.out.println("Sa2---2");
		
		sa2.assertAll();
	}

}
