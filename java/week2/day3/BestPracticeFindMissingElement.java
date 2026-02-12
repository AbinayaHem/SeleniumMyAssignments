package week2.day3;

public class BestPracticeFindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array
		int[] input= {1,4,3,2,8,6,7};
		int sum = 0;
		//declare for loop
		for(int i=0; i<input.length; i++)
		{
			sum = sum+input[i];
		}
		//print sum of the elements
		System.out.println("Sum of inputs: "+sum);
		
		int max = input[0];
		//logic to find the max number
		for(int i=1; i<input.length; i++)
		{
			if(input[i]>max)
			{
				max=input[i];
			}
		}
		System.out.println("Max number: "+max);
		
		int missingnumber = ((max*(max+1)/2)-sum);
		
		System.out.println(missingnumber);

	}

}
