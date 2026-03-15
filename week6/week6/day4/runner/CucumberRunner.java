package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/main/java/Features/Saleforce.feature", glue="steps")
public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	

}
