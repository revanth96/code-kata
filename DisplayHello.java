package codeKata;

import java.util.Scanner;

/**
 * Program to display Hello N number of times where N is specified by the user.
 * 
 * @author Ashwin Rishi
 */
public class DisplayHello {

	private static Scanner input = new Scanner(System.in);;

	public static void main(String[] args) {
		System.out.println("enter the number of times:");
		int numberOfTimes = input.nextInt();
		for (int index = 0; index < numberOfTimes; index++)
			System.out.println("Hello \n");
	}

}
