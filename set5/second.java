package set5;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter first string:");
		String string1 = input.nextLine();
		System.out.println("enter second string:");
		String string2 = input.nextLine();
		if (string1.length() > string2.length()) {
			System.out.println(string1);
		} else if (string2.length() > string1.length()) {
			System.out.println(string2);
		} else {
			System.out.println(string1);
		}
	}
}
