package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber = 0;
		int secondnumber = 1;
		int sum;
		int range = 8;
		System.out.print(firstnumber);
		for (int i = 0; i <= range; i++) {
			System.out.print("," + secondnumber);
			sum = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = sum;

		}

	}

}
