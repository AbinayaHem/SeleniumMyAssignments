package week3.day4;

public class PracticeMethodOverriddingSubClass extends PracticeMethodOverriddingSuperClass {
	
	public void sample()
	{
		super.sample();
		System.out.println("sample from sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeMethodOverriddingSubClass obj1 = new PracticeMethodOverriddingSubClass();
		obj1.sample();
		
		//PracticeMethodOverriddingSuperClass obj2 = new PracticeMethodOverriddingSuperClass();
		//obj2.sample();

	}

}
