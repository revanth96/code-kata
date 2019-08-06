package codekata;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		System.out.println("enter a character");
		Scanner input=new Scanner(System.in);
		char character = input.next().charAt(0);
		
		if(character >'a' && character < 'z' || (character >'A' && character <'Z')) {
			System.out.println("it is a alphabet");
		}
		else {
			System.out.println("it is not a alphabet:");
		}

	}

}
