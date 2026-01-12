package Tasks;

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {

        int sum = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int a = input.nextInt();


        // Example 1

        if(a < 10){

            sum = a;
            
        }

        // Example 12

        else if(a < 100 ){

            int lastDigit = a / 10 ; // get 1
            
            int digit1 = a % 10 ;    // get 2
            
            sum = lastDigit + digit1;

        }

        // Example 123

        else if(a < 1000){

            int lastDigit = a / 100 ; // get 1

            int digit1 = a % 10 ;     // get 3

            int digit2 = (a / 10) % 10; // get 2

            sum = lastDigit + digit1 + digit2 ; 

        }

        // Example 1234

        else if (a < 10000){

            int lastDigit = a / 1000 ; //get 1

            int digit1 = a % 10 ;      //get 4

            int digit2 = (a / 10) % 10; //get 3
            
            int digit3 = (a / 100) % 10; // get 2

            sum = lastDigit + digit1 + digit2 + digit3;
        }  

        // Example 12345

        else if (a < 100000){

            int lastDigit = a / 10000 ; //get 1

            int digit1 = a % 10 ;      //get 5

            int digit2 = (a / 10) % 10; //get 4
            
            int digit3 = (a / 100) % 10; // get 3

            int digit4 = (a / 1000) % 10; // get 2

            sum = lastDigit + digit1 + digit2 + digit3 + digit4;

        }

        // Example 123456

        else if (a < 1000000){

            int lastDigit = a / 100000 ; // get 1

            int digit1 = a % 10 ;        // get 6

            int digit2 = (a / 10) % 10; //get 5
            
            int digit3 = (a / 100) % 10; // get 4

            int digit4 = (a / 1000) % 10; // get 3

            int digit5 = (a / 10000) % 10; // get 2

            sum = lastDigit + digit1 + digit2 + digit3 + digit4 + digit5;


        }  

        // Example 1234567

        else if (a < 10000000){

            int lastDigit = a / 1000000 ; // get 1

            int digit1 = a % 10 ;         // get 7

            int digit2 = (a / 10) % 10; //get 6
            
            int digit3 = (a / 100) % 10; // get 5

            int digit4 = (a / 1000) % 10; // get 4

            int digit5 = (a / 10000) % 10; // get 3

            int digit6 = (a / 100000) % 10; // get 2

            sum = lastDigit + digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
        }

        System.out.println("The sum: " + sum);
    }
    
}
