package set3;

import java.util.Scanner;

public class MAximumElement {

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
		int maximum = numbers[1];
		for (int i = 0; i < n; i++) {
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
		}
		System.out.println(maximum);
	}

}
