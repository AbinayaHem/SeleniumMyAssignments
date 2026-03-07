package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignmentAmazonActions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String priceOfFirstProduct = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(priceOfFirstProduct);
		String rating = driver.findElement(By.xpath("//a[contains(@aria-label,'ratings')]")).getText();
		System.out.println(rating);
		WebElement firstProduct = driver.findElement(By.xpath("//div[@data-cy='title-recipe']"));
		firstProduct.click();
		File screenshotAs = firstProduct.getScreenshotAs(OutputType.FILE);
		File target = new File("./data/SnapOfFirstProduct.png");
		FileUtils.copyFile(screenshotAs, target);
	}

}
