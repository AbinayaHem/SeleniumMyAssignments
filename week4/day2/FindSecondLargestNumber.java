package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(21,42,55,77,33));
		Collections.sort(listOfNumbers);
		int indexSize = listOfNumbers.size();
		System.out.println(indexSize);
	}

}
