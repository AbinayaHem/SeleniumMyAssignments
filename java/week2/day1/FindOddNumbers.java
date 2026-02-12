package week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange=10;
		for(int i=1; i<=maxRange; i++)
		{
			int oddNumber = i%2;
			if(oddNumber==1)
			{
				System.out.println(i +" is the odd number");
			}
	}
}
}
