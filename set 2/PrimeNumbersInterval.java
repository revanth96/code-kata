import java.util.Scanner;

public class PrimeNumbersInterval {

	public static void main(String[] args) {
		int low, high;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the start:");
		low = in.nextInt();
		System.out.print("Enter the limit:");
		high = in.nextInt();

		while (low < high) {
			boolean flag = false;
			for (int i = 2; i <= low / 2; ++i) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.print(low + " ");
			++low;
		}
	}
}
