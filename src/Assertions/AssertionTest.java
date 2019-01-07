package Assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class AssertionTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void CheckValidData() {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("deepalithorat23@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Deepali");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		boolean exp_flag=true;
		boolean act_flag=driver.findElement(By.xpath("//img[@src='/images/banner2.gif']")).isDisplayed();
		Assert.assertEquals(act_flag, exp_flag);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@Test(priority=2)
	public void CheckInValidData() {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("deepalithorat23@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rani");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		boolean exp_flag=true;
		boolean act_flag=driver.findElement(By.xpath("//img[@src='/images/banner2.gif']")).isDisplayed();
		Assert.assertEquals(act_flag, exp_flag);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {

	}

	@BeforeSuite
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver", "D://Advance Selenium Softwares1 (2)//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void beforeTest()
	{

		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
		String exp_result="Sign-on: Mercury Tours";
				//"Welcome: Mercury Tours";
		
		String act_result=driver.getTitle();
		
		Assert.assertEquals(act_result, exp_result);
		System.out.println("Actual and Expected Result are same");
	}

	@AfterSuite
	public void afterSuite() {

		driver.close();
	}

}
