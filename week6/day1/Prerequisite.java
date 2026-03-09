package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Prerequisite {
	ChromeDriver driver;
	

@Parameters({"url","userName", "passWord"})
@BeforeMethod
	public void prerequisite(String url, String uName, String pWord)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pWord);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

@AfterMethod

	public void close()
	{
	driver.close();
	}
}
