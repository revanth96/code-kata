import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int result=1;
		Scanner input = new Scanner(System.in);

		System.out.println("enter the number:");
		int number = input.nextInt();
		
		while (number>0) {
			result*= number;
			number--;
		}
		System.out.println(result);
	}

}
