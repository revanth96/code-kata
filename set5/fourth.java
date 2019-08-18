package set5;

import java.util.Scanner;

public class fourth {
	public static void main(String[] args) {
		int flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = input.nextInt();
		for (int i = 0; i < 10; i++) {
			if (i == number) {
				flag = 1;
			}
		}
		if (flag == 1)
			System.out.println("yes");
		System.out.println("no");
	}
}
