package set5;

import java.util.Scanner;

public class third {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string:");
		String string1 = input.nextLine();
		System.out.println("enter a string again:");
		String string2 = input.nextLine();
		string2 = string1 + string2;
		System.out.println(string2);
	}
}
