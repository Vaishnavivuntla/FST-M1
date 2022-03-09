package activities;
import java.util.*;

public class Activity2 {
	
	public static void main(String[] args) {
		
	int[] numberArr = new int[] {10, 77, 10, 54, -11, 10};
	System.out.println("Original Array: " + Arrays.toString(numberArr));
	int searchNumber = 10;
	int fixedSum = 30;
	System.out.println("Result: " + result(numberArr, searchNumber, fixedSum));
	}
	public static boolean result(int[] numbers, int searchnumber, int fixedsum)
	{
		int temp_sum = 0;
	for (int i=0; i<numbers.length; i++) 
	{
		if(numbers[i] ==searchnumber)
		{
		temp_sum = temp_sum + searchnumber;
		}
			
	}
	return temp_sum == fixedsum;
	}

}
