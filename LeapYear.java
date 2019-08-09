package codeKata;

import java.util.Scanner;

/**
 * Program to find weather the entered year is leap year or not
 * 
 * @author Ashwin Rishi
 */
public class LeapYear {

	private static Scanner input;

	static boolean checkYear(int year) {
		if (year % 400 == 0)
			return true;

		if (year % 100 == 0)
			return false;

		if (year % 4 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println("enter the year:");
		input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.println(checkYear(year) ? "Leap Year" : "Not a Leap Year");

	}
}
