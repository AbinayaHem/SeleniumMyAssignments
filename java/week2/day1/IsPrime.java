package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		boolean isPrime = true;
		
		//logic to find n is prime number or not
		for(int i = 2; i<=n-1; i++)
				{
					if(n%i==0)
					{
						isPrime= false;
						break;
					}
				}
		
		if(isPrime)
					
						System.out.println(n +" is a prime number");
					
					else
					
						System.out.println(n +" is not a prime number");
					
					
				}

	}


