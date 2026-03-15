package week6.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticParameterizationHomeAssignment extends Prerequisite{
	
	@Test
	public void salesforce() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		WebElement scrollTo = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(scrollTo).perform();
		scrollTo.click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		//driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("Salesforce");
		//WebElement status = driver.findElement(By.xpath("//button[@aria-label='Status']"));
		//Select dropDown = new Select(status);
		//dropDown.selectByIndex(1);
		//Thread.sleep(3000);
		//WebElement scrollToStatus = driver.findElement(By.xpath("//button[@aria-label='Status']"));
		//act.scrollToElement(scrollToStatus);
		//Thread.sleep(6000);
		//scrollToStatus.click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//span[contains(text(),'Active')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@title='Close error dialog']")).click();
		//Alert alert1 = driver.switchTo().alert();
		//String alertText = alert1.getText();
		//System.out.println("Handled alert " +alertText);
		//alert1.dismiss();
	}
	
	
}
