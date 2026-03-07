package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to use the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//to pass the amazon endpoint
		driver.get("https://www.amazon.com/");
		//to maximize the browser
		driver.manage().window().maximize();
		//to apply the global wait for every line of code and ends when session closed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to find the element and pass key
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		//to find the element and do click action
		driver.findElement(By.id("nav-search-submit-button")).click();
		//storing many elements in a list
		List<WebElement> price =  driver.findElements(By.className("a-price-whole"));
		//System.out.println(price);
		//Object[] priceArray = null;
		//price.toArray(priceArray);
		for(int i=0;i<price.size();i++)
		{
			System.out.println(price.get(i).getText());
		}
		//to close the browser
		driver.close();
	}

}
