package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser driver
		
		ChromeDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to get the url
		driver.get("https://www.facebook.com/");
		
		//to locate the element
		driver.findElement(By.id("email")).sendKeys("abitest");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		//to close the browser
		driver.close();
	} 

}
