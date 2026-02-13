package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to initialize the WebDriver
		//ChromeDriver driver = new ChromeDriver();
				
		//to launch the chrome in guest mode
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
				
		//to get the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to find the elements
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
		
		//to close the browser
		driver.close();
		
		
	}

}
