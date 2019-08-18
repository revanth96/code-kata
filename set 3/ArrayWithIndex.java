package set3;

import java.util.Scanner;

public class ArrayWithIndex {
	public static void main(String[] args) {
		int numbers[];
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = input.nextInt();
		numbers = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(+numbers[i] + " " + i);
		}
	}
}
