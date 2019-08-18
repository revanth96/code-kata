package set4;

import java.util.Scanner;

public class CountLines {
	public static void main(String[] args) {
		int count = 0;
		String string = "";
		Scanner input = new Scanner(System.in);
		System.out.println("enter the words");
		while (input.hasNext()) {
			count++;
			string = input.nextLine();
			if (string.equals("exit"))
				break;
			else
				string += string;
		}
		System.out.println(count - 1);
	}

}
