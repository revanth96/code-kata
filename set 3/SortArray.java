package set3;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
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
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (numbers[i] > numbers[j]) {
					int a = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = a;
				}
			}
		}
		System.out.printf("%s", Arrays.toString(numbers));
	}
}
