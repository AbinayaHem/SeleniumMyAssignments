package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FindTheMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,5,7,9));
		Collections.sort(numbers);
		
		for(int i=0;i<numbers.size()-1;i++)
		{
			int currentNumber = numbers.get(i);
			int next = numbers.get(i+1);
			
			
				if (currentNumber+1!=next)
				{
					for(int j=currentNumber +1;j<next;j++)
					System.out.println("Missing number is " +j);
				}
			}
		}
		
		
	}

}
