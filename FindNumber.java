package codekata;

import java.util.Scanner;

public class FindNumber {
	  public static void main(String args[]){
	      int number;
	      System.out.println("Enter a numberber :");
	      Scanner input = new Scanner(System.in);
	      number = input.nextInt();

	      if (number > 0){
	         System.out.println("Given numberber is a positive integer");
	      } else if(number < 0){
	         System.out.println("Given numberber is a negative integer");
	      } else if (number ==0 ) {
	         System.out.println("Given numberber is 0");
	      }
	      else {
	    	  System.out.println("wrong input");
	      }
	   }

}
