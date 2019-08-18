package set5;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		int flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = input.nextInt();
		while (number > 0) {
			number /= 10;
			flag++;
		}
		System.out.println(flag);
	}

}
