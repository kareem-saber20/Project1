package Tasks;

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {

        int sum = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Numbers without spaces: ");
        String x = input.next();

        for (int i= 0 ; i <= x.length()-1 ; i++) {

            // 48 >> uni code of number 0
            
            sum =  sum +  x.charAt(i) - 48;
            System.out.print(x.charAt(i) + " ");
            
        } 
        
        System.out.println( "\n"+ "Output: "  + sum); 


    }
    
}
