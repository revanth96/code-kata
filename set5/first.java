package set5;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string:");
		String string = input.nextLine();
		System.out.println("enter a number:");
		int number = input.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println(string);
		}
	}

}
