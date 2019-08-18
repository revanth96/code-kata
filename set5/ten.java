package set5;

import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number;
		System.out.println("enter the number");
		number = input.nextInt();
		if (IsPowerOfTwo(number)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	private static boolean IsPowerOfTwo(long x) {
		return (x & (x - 1)) == 0;
	}

}
