package week1.day2Assignment;

public class GivenNoPrimeorNot {

	public static void main(String[] args) {
		int n = 13;
		int count = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("The given No.is Prime ");
		} else {
			System.out.println("The given No.is not a Prime");
		}
	}
}