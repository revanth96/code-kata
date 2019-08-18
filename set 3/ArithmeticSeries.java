package set3;

import java.util.Scanner;

public class ArithmeticSeries {

	private static Scanner input;

	static float calculateAP(float a, float d, int n) {
		float sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a;
			a = a + d;
		}
		return sum;
	}

	public static void main(String args[]) {
		int n;
		float a,d;
		input = new Scanner(System.in);
		System.out.println("enter n: ");
		n=input.nextInt();
		System.out.println("enter a: ");
		a=input.nextInt();
		System.out.println("enter d: ");
		d=input.nextInt();
		System.out.println(calculateAP(a, d, n));
	}

}
