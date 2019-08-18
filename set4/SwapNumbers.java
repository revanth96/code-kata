package set4;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstNumber, secondNumber, temp;
		System.out.println("enter the two numbers:");
		firstNumber = input.nextInt();
		secondNumber = input.nextInt();
		temp = secondNumber;
		secondNumber = firstNumber;
		firstNumber = temp;
		System.out.println(+firstNumber + "\n" + secondNumber);
	}

}
