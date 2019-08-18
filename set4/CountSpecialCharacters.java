package set4;

import java.util.Scanner;

public class CountSpecialCharacters {

	public static void main(String[] args) throws NumberFormatException {
		int characters = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the word:");
		String string = input.nextLine();
		char eachletter;
		for (int i = 0, length = string.length(); i < length; i++) {
			if (string.substring(i, i + 1).matches("[^A-Za-z0-9]")) {
				characters++;
			}
		}
		System.out.println(characters);
	}
}
