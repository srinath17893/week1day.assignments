package week1.day1.assignments;

public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of number is " +fact);
	}

}
