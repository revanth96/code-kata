package codeKata;

import java.util.Scanner;

/**
 * program to calaculate sum of N natural numbers.
 * 
 * @author Ashwin Rishi
 */
public class SumOfNaturalNumbers {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numbers[];
		int sum = 0;

		System.out.println("enter the total count of numbers");
		int totalCount = input.nextInt();
		numbers = new int[totalCount];

		System.out.println("\n enter the numbers");
		for (int index = 0; index < totalCount; index++) {
			numbers[index] = input.nextInt();
			sum += numbers[index];
		}
		System.out.println(+sum + " is the sum of all numbers");
	}
}
