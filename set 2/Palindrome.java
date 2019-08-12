package codeKata.set2;

import java.util.Scanner;

public class Palindrome {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a number to check palindrome");
		int number =input.nextInt();
		int reversedInteger=0; int reminder=0;
		int initialValue=number;
		while (number>0) {
			reminder= number%10;
			number/=10;
			reversedInteger= reversedInteger*10+reminder;
		}
		if (reversedInteger == initialValue ) 
			System.out.println("yes:");
		else
			System.out.println("no");

	}

}
