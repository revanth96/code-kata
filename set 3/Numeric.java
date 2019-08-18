package set3;

import java.util.Scanner;

public class Numeric {
	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		boolean numeric = true;
		try {
			Double number = Double.parseDouble(string);
		} catch (NumberFormatException e) {
			numeric = false;
		}
		if (numeric)
			System.out.println("yes");
		else
			System.out.println("No");
	}
}
