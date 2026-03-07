package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrameHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		String alert1Text = alert1.getText();
		System.out.println("Alert text is: " +alert1Text);
		alert1.dismiss();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.contains("cancel"))
		{
			System.out.println("Verified - Action is performed correctly");
		}
		else
		{
			System.out.println("Not verified - Action is not performed correctly");
		}
		driver.close();
	}

}
