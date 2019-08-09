package codeKata;

import java.util.Scanner;

public class NumberOfDigits {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the number:");
		int number = input.nextInt();
		int digit = 1;
		if (number > 0) {
			while (number >= 10) {
				number = number / 10;
				digit++;
			}
			System.out.println("total digits:" + digit);
		} else {
			System.out.println("enter a positive number");
		}
	}
}
