package set3;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayFunction{
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
		Arrays.sort(numbers);
		System.out.printf("%s", Arrays.toString(numbers));
	}

}
