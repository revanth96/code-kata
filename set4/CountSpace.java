package set4;

import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {
		int spaces = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the words");
		String string = input.nextLine();
		for (int i = 0, length = string.length(); i < length; i++) {
			if (string.charAt(i) == ' ') {
				spaces++;
			}
		}
		System.out.println(spaces);
	}
}
