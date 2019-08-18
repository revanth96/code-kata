import java.util.Scanner;

public class MultiplesOfFive {

	public static void main(String[] args) {
		int result, iterator = 1;
		Scanner input = new Scanner(System.in);

		System.out.println("enter the number:");
		int number = input.nextInt();

		while (iterator <= 5) {
			result = number * iterator;
			System.out.println(result);
			iterator++;
		}
	}
}
