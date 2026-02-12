package week2.day2;

public class Browser 
{
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return(browserName);
		}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj1= new Browser();
		String launchBrowser=obj1.launchBrowser("");
		
		System.out.println(launchBrowser);
		obj1.loadUrl();
	}

}
