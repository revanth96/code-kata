package codeKata.set2;

import java.util.Scanner;
/**
 * program to calculate integer with exponent.
 * @author Ashwin Rishi
 *
 */
public class Exponent {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		long result =1;
		System.out.println("enter the integer");
		int base = input.nextInt();
		System.out.println("enter its exponent:");
		int exponent=input.nextInt();
		for (int index=0;index<exponent;index++) {
			result*=base;
		}
		System.out.println("the values is :"+result);
	}

}
