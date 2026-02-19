package week3.day4;

public class LoginPage extends BasePage{
	
	@Override
	public void performCommonTasks()
	{
		super.findElement();
		super.clickElement();
		super.enterText();
		super.performCommonTasks();
		System.out.println("This is performCommonTasks in Sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage();
		obj.performCommonTasks();
	}

}
