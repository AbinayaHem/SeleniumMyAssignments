package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnCrossBrowser {
	WebDriver driver;
	
	@Parameters({"browser", "url", "userName", "passWord"})
	@BeforeMethod
	public void preCondition(String browserName, String url, String uName, String pWord) throws InterruptedException
	{
		switch(browserName)
		{
		case "Chrome":
			System.out.println("The execution is in Chrome");
			break;
		case "Firefox":
			System.out.println("The execution is in Firefox");
			break;
		default:
			System.out.println("The execution is in IE");
			break;	
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Test
		public void test() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
