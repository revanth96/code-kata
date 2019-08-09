package codeKata;

import java.util.Scanner;

/**
 * Program that calculates K sum of numbers on an given N numbers:
 * 
 * @author Ashwin Rishi
 */
public class TwoNumberPlay {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("enter the total numbers:");

		int totalCount = input.nextInt();
		System.out.println("enter for how many numbers the total sum must be calculated:");
		int sumValueCount = input.nextInt();
		for (int index = 1; index <= totalCount; index++) {
			if (index <= sumValueCount)
				sum += index;
		}
		System.out.println("the total sum for first " + sumValueCount + " numbers are:" + sum);
	}
}
