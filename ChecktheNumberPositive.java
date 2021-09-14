package week1.day1.assignments;

import java.util.Scanner;

public class ChecktheNumberPositive {
	public static void main(String[] args) {
		int num=35;
//		int number;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		number=sc.nextInt();
		if(num>0) {
			System.out.println("The Number is positive number");
		}
		else if(num<0){
			System.out.println("The number is Negative number");
		}
		else {
			System.out.println("Neither number is Positive or Negative");
		}
	}

}
