package set4;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		System.out.println("enter the numbers:");
		int number = input.nextInt();
		int firstValue = 0;
		int secondValue = 1;
		for (int i = 0; i < number; i++) {
			result = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = result;
			System.out.println(result);
		}
	}
}
