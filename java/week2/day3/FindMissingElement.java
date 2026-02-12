package week2.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the array
		int[] input= {1,4,3,2,8,6,7};
		//to sort the array
		Arrays.sort(input);
		//declare for loop
		for(int i=0; i<input.length; i++)
		{
			if(input[i] != i+1)
			{
				System.out.println("Missing number = "+(i+1));
				break;
			}
		}
	}

}
