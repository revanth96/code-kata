package codekata;

import java.util.Scanner;
/**
 * Program to find the character is vowel or not.
 * @author Rishi
 *
 */
public class VowelOrConsonants {

	public static void main(String[] args) {
		System.out.println("enter a character");
		Scanner input=new Scanner(System.in);
		char character = input.next().charAt(0);
		
		if(character == 'a' || character == 'e'||character == 'i'||character == 'o'||character == 'u') {
			System.out.println("it is a vowel");
		}
		else {
			System.out.println("it is not a vowel:");
		}
	}

}
