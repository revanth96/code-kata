import java.util.Scanner;

public class ArmStrong {
	public static void main(String args[]) {
		int reminder, finalValue = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("enter the number:");
		int number = input.nextInt();
		int intialValue = number;

		while (number > 0) {
			reminder = number % 10;
			finalValue += (reminder * reminder * reminder);
			number /= 10;
		}
		if (finalValue == intialValue)
			System.out.println("yes");
		else
			System.out.println("\n no");
	}

}
