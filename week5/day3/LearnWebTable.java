package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");	
        ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("MAS", Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("MDU", Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//List<WebElement> row = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr"));
		
		List<WebElement> nameOfTrains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		List<String> listOfTrains = new ArrayList<>();
		
		for(WebElement trainName : nameOfTrains)
		{
			String name = trainName.getText();
			System.out.println(name);
			listOfTrains.add(name);
		}
		Set<String> uniqueValue = new HashSet<>(listOfTrains);
		if(uniqueValue.size() != nameOfTrains.size())
		{
			System.out.println("Duplicate values are there");
		}
		else
		{
			System.out.println("Duplicate values are not there");
		}
	}

}
