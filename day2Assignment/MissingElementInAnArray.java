package week1.day2Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i = i + 1) {
			if (arr[i] == i + 1) {
				continue;
			} else {
				System.out.println("Mising number is " + arr[i]);
				break;
			}
		}
	}

}
