package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccount extends EnvironmentSetup {
	
	@Test
	public void createAccount()
	{
	driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Abinaya11");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.id("numberEmployees")).sendKeys("4");
	driver.findElement(By.className("smallSubmit")).click();
	String titleName = driver.getTitle();
	System.out.println("TitleName is " +titleName);
	}
	
	
}
