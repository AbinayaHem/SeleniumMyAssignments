package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends EnvironmentSetup{
	
	@Test
	public void createLead()
	{
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testcompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abinaya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hem");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
		driver.findElement(By.name("submitButton")).click();
		String titleName = driver.getTitle();
		System.out.println("Titlename of this page is "+ titleName);
	}
}
