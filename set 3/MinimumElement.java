package set3;

import java.util.Scanner;

public class MinimumElement {
	public static void main(String[] args) {
		int numbers[];
		int value[];
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = input.nextInt();
		numbers = new int[n];
		value = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		int minimum = numbers[1];
		for (int i = 0; i < n; i++) {
			if (numbers[i] < minimum) {
				minimum = numbers[i];
				value[i] = minimum;
			}
		}
		System.out.println(minimum);
	}
}
