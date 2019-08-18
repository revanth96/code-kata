import java.util.Scanner;

public class IntervalsArmstrong {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter the starting number:");
		int low = input.nextInt();

		System.out.println("enter the limit number:");
		int high = input.nextInt();

		for (int number = low + 1; number < high; ++number) {
			int digits = 0;
			int result = 0;
			int originalNumber = number;

			while (originalNumber != 0) {
				originalNumber /= 10;
				++digits;
			}
			originalNumber = number;

			while (originalNumber != 0) {
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
			}
			if (result == number)
				System.out.print(number + " ");
		}
	}
}
