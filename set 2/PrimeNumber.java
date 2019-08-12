package codeKata.set2;

import java.util.Scanner;
/*
 *Program to find the prime number: 
 */
public class PrimeNumber {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a number to check prime number or not:");
		int number =input.nextInt();
		int flag=0;
	    for(int index = 2; index <= number/2; ++index)
	    {
	        if(number%index == 0)
	        {
	            flag = 1;
	            break;
	        }
	    }
	    if (number == 1) 
	    {
	      System.out.println("1 is neither a prime nor a composite number.");
	    }
	    else 
	    {
	        if (flag == 0)
	          System.out.println("yes");
	        else
	          System.out.println("no");
	    }
	}

}
