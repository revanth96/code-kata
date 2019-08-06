package codekata;

import java.util.Scanner;

public class EvenOrOdd {
	  public static void main(String args[]){
	      int number;
	      System.out.println("Enter a numberber :");
	      Scanner input = new Scanner(System.in);
	      number = input.nextInt();
	      if (number%2 ==0){
	         System.out.println("Given numberber is even");
	      }
	      else {
	    	  System.out.println("given number is odd");
	      }
	   }
}
