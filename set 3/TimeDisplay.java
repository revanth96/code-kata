package set3;

import java.util.Scanner;

public class TimeDisplay {
	public static void main(String[] args) {
		int index = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter minutes");
		int number = input.nextInt();
		while (number >= 60) {
			number -= 60;
			index++;
		}
		System.out.println(+index + " " + number);
	}

}
