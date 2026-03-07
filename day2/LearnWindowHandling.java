package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//launch the url
		driver.get("https://www.irctc.co.in/");
		//maximize the browser
		driver.manage().window().maximize();
		//will be execute in each line of code and waits until the web element is present
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to find the element and click
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		//get the active window and store in set of string
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		//covert set to list
		List<String> activeWindows = new ArrayList<String>(childWindow);
		//switch to the active window that is in index 1
		driver.switchTo().window(activeWindows.get(1));
		//get the title of the child window
		String titleOfChildWindow = driver.getTitle();
		System.out.println("Child window title is : " +titleOfChildWindow);
		//close the current window
		driver.close();
		//switch back to the parent window
		driver.switchTo().window(activeWindows.get(0));
		//get the title of the parent window
		String titleOfParentWindow = driver.getTitle();
		System.out.println("Parent window title is : " +titleOfParentWindow);
		//close the parent window
		driver.close();
	}

}
