package week1.day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		int check = 0;
		int temp = 0;
		int originalNum = 34343;
		
		for (int num = originalNum; num != 0; num = num / 10) { 
			temp = num % 10; 
			check = (check * 10) + temp; 
		}
		
		if (check == originalNum)
		{
			System.out.println("It is a Plaindrome");
		}
		else
		{
			System.out.println("It is not a Plaindrome");
		}
	}
}