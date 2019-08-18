package set5;

import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbers[];
		int result = 0, sum = 0;
		System.out.println("enter the total numbers");
		int n = input.nextInt();
		numbers = new int[n];
		System.out.println("enter the numbers:");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		for (int i = 1; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		result = sum / numbers.length;
		System.out.println(result);
	}

}
