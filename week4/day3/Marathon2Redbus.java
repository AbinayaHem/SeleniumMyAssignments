package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marathon2Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		//open redbus website
		driver.get("https://www.redbus.in/");
		//maximize browser window
		driver.manage().window().maximize();
		//Apply implicit wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter source city in From field
		driver.findElement(By.xpath("//input[@id='srcinput']")).sendKeys("Chennai", Keys.ENTER);
		//Select Chennai
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		//Enter Destination city in To field
		driver.findElement(By.xpath("//input[@id='destinput']")).sendKeys("Kodaikanal", Keys.ENTER);
		//Select Kodaikanal
		driver.findElement(By.xpath("//div[text()='Kodaikanal']")).click();
		//wait for 3 seconds
		Thread.sleep(3000);
		//Select travel date and select 26
		driver.findElement(By.xpath("//div[contains(@aria-label,'Select Date')]")).click();
		driver.findElement(By.xpath("//span[text()='26']")).click();
		//Search bus
		driver.findElement(By.xpath("//button[contains(@aria-label,'Search buses')]")).click();
		//find number of buses found and print it in seperate line
		String numberOfBuses = driver.findElement(By.xpath("//div[@class='busesFoundText__ind-search-styles-module-scss-PHVGD']")).getText();
		System.out.println(numberOfBuses);
		Thread.sleep(3000);
		//filter with AC bus and store the number of buses in String and print it
		driver.findElement(By.xpath("//div[text()='AC (8)']")).click();
		Thread.sleep(3000);
		String numberOfBusesAfterACSelected = driver.findElement(By.xpath("//div[@class='busesFoundText__ind-search-styles-module-scss-PHVGD']")).getText();
		System.out.println("Number of buses after filtered with AC " +numberOfBusesAfterACSelected);
		//filter with High rated bus and store the number of buses in String and print it
		driver.findElement(By.xpath("//div[text()='High Rated Buses (8)']")).click();
		Thread.sleep(3000);
		System.out.println("Number of buses after filtered with High rated " +numberOfBusesAfterACSelected);
		Thread.sleep(3000);
		
		//find the elements that contains partial values "finalFare" in class attribute with p tag and store it in list
		List<WebElement> elements = driver.findElements(By.xpath("//p[contains(@class,'finalFare')]"));
		//Create an empty list to store numeric price values
		List<Integer> listPrice = new ArrayList<Integer>();
		//Loop runs from 0 to total number of price elements
		for (int i = 0; i < elements.size(); i++) {
			Thread.sleep(30);
			//get the visible text of each price
			String price = elements.get(i).getText();
			//convert string to integer and remove everything except digits
			int pricelist = Integer.parseInt(price.replaceAll("[^0-9]",""));
			//add converted integer value to list
			listPrice.add(pricelist);
			}
		//sort the prices
		Collections.sort(listPrice);
		//print the lowest price
		System.out.println("The lowest price is "+listPrice.get(0));
		//get the title and print it
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		//close the browser
		driver.close();
		
		}
	}

