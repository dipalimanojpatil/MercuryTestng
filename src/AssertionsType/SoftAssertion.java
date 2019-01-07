package AssertionsType;


//SoftAssertions On 1 Object


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void testdata()
	{
		sa.assertEquals(1, 1);		//int
		System.out.println(1);
		
		sa.assertEquals(6, 19);		//int
		System.out.println(2);
		
		sa.assertEquals(2.6, 2.6);		//float
		System.out.println(3);
		
		sa.assertEquals(5.6 , 8.4);		//float
		System.out.println(4);
		
		
		sa.assertEquals("Jack", "Jack");	//string
		System.out.println(5);
		
		sa.assertEquals("John", "Corter");   //String
		System.out.println(6);
	
		sa.assertAll();
	}

}
