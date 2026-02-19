package week3.day4;

public class PracticeMethodOverloading {
	
	//to practice method overloading
	public void reportStep(String msg, String status)
	{
		System.out.println(msg);
		System.out.println(status);
		}
	
	public void reportStep(String msg, String status, boolean snap)
	{
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeMethodOverloading obj = new PracticeMethodOverloading();
		obj.reportStep("Abi", "Pass");
		
	}

}
