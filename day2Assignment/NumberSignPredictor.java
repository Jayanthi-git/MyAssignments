package week1.day2Assignment;

public class NumberSignPredictor {

	public static void main(String[] args) {
		int num = 40;
		if (num < 0) {
			num = num * -1;
			System.out.println("Number converted");
		} else {
			System.out.println("Number is positive and need not be converted");
		}
		System.out.println("Number is  " + num);
	}

}
