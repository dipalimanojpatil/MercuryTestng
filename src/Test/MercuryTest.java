package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MercuryTest {

	public WebDriver driver;

	@BeforeSuite // 1

	public void beforeSuite() {
		

		System.setProperty("webdriver.chrome.driver", "D://Advance Selenium Softwares1 (2)//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void beforeTest() {
		driver.get("http://newtours.demoaut.com/mercurysignon.php");

	}

	@BeforeClass
	public void beforeClass() {
		driver.manage().window().maximize();

	}

	/*
	  @BeforeMethod public void beforeMethod() {
	  
	  }
	 */
	/*
	  @Test(priority=1) public void Test_Fun_For_Login()
	  {
	   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("deepalithorat23@gmail");
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("deepali");
	
	   driver.findElement(By.xpath("//input[@value='Login']")).click(); }
	 */
	@Test(priority = 1)
	public void Test_For_Registration()
	{
		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.name("firstName")).sendKeys("Manoj");

		driver.findElement(By.name("lastName")).sendKeys("Patil");

		driver.findElement(By.name("phone")).sendKeys("9867766543");

		driver.findElement(By.id("userName")).sendKeys("manojpatil23@gmail.com");

		driver.findElement(By.name("address1")).sendKeys("sneha complex");

		driver.findElement(By.name("address2")).sendKeys("flat no.5");

		driver.findElement(By.name("city")).sendKeys("Pune");

		driver.findElement(By.name("state")).sendKeys("Maharashtra");

		driver.findElement(By.name("postalCode")).sendKeys("411058");

		WebElement c = driver.findElement(By.name("country"));
		Select sel = new Select(c);

		sel.selectByVisibleText("INDIA");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manojpatil23@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manoj");

		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("manoj");
		driver.findElement(By.name("register")).click();

	}

	@Test(priority = 2)
	public void Test_Fun_For_New_Login() 
	{
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("manojpatil23@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manoj");

		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@AfterMethod
	public void Take_ScreenShot() throws IOException
	
	{

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://Deepa(Testing)//folderforScreenShotPro//loginsucess.jpg"));

	}

	@AfterClass
	public void afterClass() {

		driver.close();
		System.out.println("Exit");

	}

	@AfterTest
	public void afterTest() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
