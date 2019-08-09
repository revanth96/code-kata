package codeKata;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * Program to find the largest of three numbers on user input
 */
class LargestOfThree{
    public static void main(String[] args) {
       System.out.println("enter three numbers");
        
        System.out.println("enter the first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("\n enter the second number:");
        int secondNumber = input.nextInt();
        System.out.println("\n enter the third number:");
        int thirdNumber = input.nextInt();
        if (firstNumber > secondNumber){
            if(firstNumber>thirdNumber){
                System.out.println(+firstNumber +" is the greatest" );
            }
            else{
                System.out.println(+thirdNumber+" is the greatest" );
            }
        }
        else if(secondNumber>thirdNumber){
            System.out.println(+secondNumber+" is the greatest");

        }
        else {
            System.out.println(thirdNumber +" is the greatest:");
        }
    }
}