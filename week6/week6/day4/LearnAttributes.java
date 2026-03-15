package week6.day4;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	
	@Test(priority = 0, enabled = true)
	public void createLead() {
		// TODO Auto-generated method stub
		System.out.println("createLead");
	}
	
	@Test(dependsOnMethods = "createLead", alwaysRun = true, priority = 2)
	public void mergeLead() {
		// TODO Auto-generated method stub
		System.out.println("mergeLead");
	}
	
	@Test(priority = 1)
	public void deleteLead() {
		// TODO Auto-generated method stub
		System.out.println("deleteLead");
	}
	
	@Test(enabled = true, priority = 0, invocationCount = 3, invocationTimeOut = 3000)
	public void editLead() {
		// TODO Auto-generated method stub
		System.out.println("editLead");
	}
	
	@Test(enabled = false)
	public void duplicateLead() {
		// TODO Auto-generated method stub
		System.out.println("duplicateLead");
	}
}
