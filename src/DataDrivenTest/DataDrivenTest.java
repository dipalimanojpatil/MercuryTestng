package DataDrivenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class DataDrivenTest {

	WebDriver driver;

	@BeforeSuite
	public void BrowserUp() {

		System.setProperty("webdriver.chrome.driver", "D://Advance Selenium Softwares1 (2)//chromedriver.exe");
		driver = new ChromeDriver();

	}

	@BeforeTest
	public void WindowUpWindowMaximize() {

		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
	}

/*	@BeforeMethod
	public void DeleteCookies() {

		driver.manage().deleteAllCookies();
	}
*/

	@Test(dataProvider = "getdata")
	public void LoginValidData(String usernm, String pswd)
	{
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(usernm);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		// user 1
		data[0][0] = "deepalithorat23@gmail.com";
		data[0][1] = "Deepali";

		// user 2
		data[1][0] = "mynameisprs007@gmail.com";
		data[1][1] = "MercuryTandT";

		// user 3
		data[2][0] = "manojpatil@gmail.com";
		data[2][1] = "manoj";
		
		return data;
	}


	@AfterSuite
	public void WindowClose() {
		
		driver.close();
	}

}
