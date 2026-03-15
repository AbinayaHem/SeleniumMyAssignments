package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	ChromeDriver driver;
	@Given("Load the url")
	public void load_the_url() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");
	    driver = new ChromeDriver(options);
	    driver.get("https://login.salesforce.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("enter the username")
	public void enter_the_username() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abismiley123.e583fc26f234@agentforce.com");
	    
	}

	@Given("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sweetinbam@25");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Verify homepage is displayed")
	public void verify_homepage_is_displayed() {
	    String homePageTitle = driver.getTitle();
	    
	    if(homePageTitle.contains("Salesforce"))
	    {
	    	System.out.println("Homepage title is verified successfully");
	    	System.out.println(homePageTitle);
	    }
	    else
	    {
	    	System.out.println("Homepage is not verified");
	    }
	}

	@When("Click on toggle menu")
	public void click_on_toggle_menu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@When("Click View All")
	public void click_view_all() {
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
	}

	@When("Click Sales from App Launcher")
	public void click_sales_from_app_launcher() {
	    WebElement scrollTo = driver.findElement(By.xpath("//p[text()='Sales']"));
	    Actions act = new Actions(driver);
	    act.scrollToElement(scrollTo).perform();
	    scrollTo.click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
	    WebElement account = driver.findElement(By.xpath("//a[@title='Accounts']"));
	    driver.executeScript("arguments[0].click();", account);
	}

	@When("Click on New button")
	public void click_on_new_button() {
	    driver.findElement(By.xpath("//div[@title='New']")).click();
	}

	@When("Enter Account name")
	public void enter_account_name() {
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Abi");
	}

	@When("Select Ownership")
	public void select_ownership() {
	    WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	    driver.executeScript("arguments[0].click();", ownership);
	    driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("Click Save")
	public void click_save() {
	    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("Verify Account name")
	public void verify_account_name() {
	    String verifyAccountName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
	    if(verifyAccountName.contains("Abi"))
	    {
	    	System.out.println("Account name is verified successfully");
	    }
	    else
	    {
	    	System.out.println("Account name is not verified");
	    }
	    driver.quit();
	}
	


}
