package set4;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) throws NumberFormatException {
		int characters = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the word:");
		String string = input.nextLine();
		char eachletter;
		for (int i = 0, length = string.length(); i < length; i++) {
			if (Character.isDigit(string.charAt(i))) {
				characters++;
			}
		}
		System.out.println(characters);
	}
}
