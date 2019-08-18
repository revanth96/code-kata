package set4;

import java.util.Scanner;

public class SwapUsingBitwise {

	public static void main(String args[]) {
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the two numbers:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;

		System.out.println(+num1 + "\n" + num2);
	}
}
