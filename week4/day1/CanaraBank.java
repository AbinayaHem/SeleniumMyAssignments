package week4.day1;

public abstract class CanaraBank implements Payments{
	
	//declaring the unimplemented methods which are in interface
	

public void cashOnDelivery()
{
	System.out.println("cashOnDelivery from abstract class");
}
	
public void upiPayments()
	{
	System.out.println("upiPayments from abstract class");
	}
	
public void cardPayments()
{
	System.out.println("cardPayments from abstract class");
}
	
public void internetBanking()
{
	System.out.println("internetBanking from abstract class");
}

//creating one more method in abstract class and implementing
public void recordPaymentDetails()
{
	System.out.println("payment specifics from abstract class");
}

}
