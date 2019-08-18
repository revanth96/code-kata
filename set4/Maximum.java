package set4;

import java.util.Scanner;

public class Maximum {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num1[] = new int[10];
		System.out.println("enter the numbers:");
		for (int i = 0; i < 10; i++) {
			num1[i] = input.nextInt();
		}
		int maximum = num1[1];
		for (int i = 0; i < 10; i++) {
			if (num1[i] > maximum) {
				maximum = num1[i];
			}
		}
		System.out.println(maximum);
	}
}
