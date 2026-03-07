package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marathon2Decathlon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to launch the browser
		ChromeDriver driver = new ChromeDriver();
		//open the decathlon website
		driver.get("https://www.decathlon.in/");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Buy Sporting Goods, Sportswear and Equipments"))
		{
			System.out.println("Decathlon homepage is displayed");
		}
		else
		{
			System.out.println("This is not Decathlon homepage");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Search for']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='bg-grey-50 rounded-full']/div/span")).sendKeys("Shoes");
		driver.findElement(By.xpath("//span[normalize-space()='Search for']/preceding::input")).sendKeys("Shoes",
				Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Sport shoes')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Running')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Men')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Most Relevant')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Highest Discount')]")).click();
		driver.findElement(By.xpath("(//p[@class='capitalize text-14 lg:text-14 whitespace-nowrap overflow-ellipsis overflow-hidden mt-1'])[1]")).click();
		//driver.findElement(By.xpath("//div[@id='size-select-container']//p[contains(normalize-space(),'Left')]")).click();
		//List<WebElement> availableSizes = driver.findElements(By.xpath("//div[@id='size-select-container']//p[contains(normalize-space(),'Left')]"));
		driver.findElement(By.xpath("//div[contains(text(),'8.5')]")).click();
		//if(availableSizes.size()>0)
//{
	//availableSizes.get(0).click();
	//System.out.println("First available size selected");
//}
		//else
		//{
			//System.out.println("not selected");
		//}
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@aria-label='addToCart']")).click();
		WebElement cart = driver.findElement(By.xpath("//span[text()='ADD TO CART']"));
		driver.executeScript("arguments[0].click();", cart);
		
		
	}

}
