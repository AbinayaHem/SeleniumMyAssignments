package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterizationHomeAssignmentSalesforce extends projectSpecifiedMethod{
	
	@DataProvider(name="getValue")
	public String[][] fetchData()
	
	{
		String[][] data = new String[2][1];
		data[0][0] = "Abi";
		
		data[1][0]= "Jos";
		
		return data;
 	}
	
	@Test(dataProvider = "getValue")
	public void salesforce(String name)
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		WebElement scrollTo = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(scrollTo).perform();
		scrollTo.click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(name);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
	}
}
