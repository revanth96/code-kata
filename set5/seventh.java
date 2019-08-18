package set5;

import java.util.Scanner;

public class seventh {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int numbers[];
		System.out.println("enter the total numbers");
		int n = input.nextInt();
		numbers = new int[n];
		System.out.println("enter the numbers:");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		int smallest = numbers[0];
		int largetst = numbers[0];
		for(int i=1; i< numbers.length; i++)
		{
			if(numbers[i] > largetst)
				largetst = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
			
		}
		System.out.println(+largetst+""+smallest);
	}

}
