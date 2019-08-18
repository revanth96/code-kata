
import java.util.Scanner;

public class PrintOdd {
    
    public static void main(String[] args){
        
        int limit,start, i;
        
        //create a scanner object to get the input
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the start:");
        start = in.nextInt();
        
        //get the limit from user
        System.out.print("Enter the limit:");
        limit = in.nextInt();
        
        //print the odd numbers
        System.out.println("Odd numbers:");
        
        //loop till the limit
        for(i=start; i<limit; i++){
            
            //divide by 2 if the remainder is not 0 then it is an odd number
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}