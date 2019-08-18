package set4;

import java.util.Scanner;

public class CountLetter {
	public static void main(String[] args) {

		int characters = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the word:");
		String string = input.nextLine();
		for (int i = 0, length = string.length(); i < length; i++) {
			if (string.charAt(i) != ' ') {
				characters++;
			}
		}
		System.out.println(characters);

	}
}
