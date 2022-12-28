package week1.day2Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fn = 0;
		int sn = 1;
		int sum = 0;
		int range = 8;
		System.out.println(fn);
		System.out.println(sn);
		for (int i = 1; i < range; i++) {
			sum = fn + sn;
			System.out.println(sum);
			fn = sn;
			sn = sum;

		}

	}

}
