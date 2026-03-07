package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to use the chrome browser
				ChromeDriver driver = new ChromeDriver();
				//to pass the amazon endpoint
				driver.get("https://www.myntra.com/");
				//to maximize the browser
				driver.manage().window().maximize();
				//to apply the global wait for every line of code and ends when session closed
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//to find the element and pass key
				driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bag");
				driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
				//driver.findElement(By.linkText("Men")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//ul[@class='gender-list']/li/label[contains(text(),'Men')]")).click();
				driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();
				String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
				System.out.println(count);
				//int countOfItems = Integer.parseInt(count);
				
				//System.out.println(countOfItems);
				
				List<WebElement> brands = driver.findElements(By.xpath("//ul[@class='brand-list']"));
				for(WebElement brand: brands)
				{
					System.out.println("List of brands are listed below");
					System.out.println(brand.getText());
				}
				
				List<WebElement> names = driver.findElements(By.xpath("//h4[@class='product-product']"));
				Thread.sleep(3000);
				System.out.println("List of name of the bags are listed below");
				for(WebElement nameOfBags : names)
				{
					Thread.sleep(3000);
					System.out.println(nameOfBags.getText());
				}
				
	}

}
