package week1.day2Assignment;

import java.util.Arrays;

public class SecondSmallestNumberFinder {

	public static void main(String[] args) {
		int numbers[] = { 23, 45, 67, 32, 89, 22 };
		Arrays.sort(numbers);
		System.out.println("Second smallest number is " + numbers[1]);
	}

}
