package Tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
      
        int[] numbers = new int[n];

        // enter and store the input numbers in array

        System.out.print("\n"+"Enter " + n + " numbers: ");
        
        for(int i = 0 ; i <= numbers.length - 1 ; i++){
            
            numbers[i] = input.nextInt();

        }

        maxNumber(numbers);
        minNumber(numbers);

        sortArray(numbers);
    
    }

    // find the max number 

    public static void maxNumber(int[] array){

            int maxNumber = array[0];

            for(int i = 0; i <= array.length -1 ; i++){

                if(maxNumber < array[i]){
            
                  maxNumber = array[i];
                }                
            }
            
            System.out.println("\n" + "Max number: " + maxNumber + "\n");
        }

    //find the min number

    public static void minNumber(int[] array){

            int minNumber = array[0];

            for(int i = 0; i <= array.length -1 ; i++){

                if(minNumber > array[i]){
            
                  minNumber = array[i];
                }                
            }
            
            System.out.println("Min number: " + minNumber + "\n");
        }

    // sort numbers even or odd and get the sum

    public static void sortArray(int[] array){

        int counterEven = 0;
        int sumEven = 0;

        int counterOdd = 0;
        int sumOdd = 0;

        for(int i = 0 ; i < array.length ;  i++){

            if(array[i] % 2 == 0 ){

                counterEven++; //
                sumEven += array[i];
                
            }

            else{

                counterOdd++; //
                sumOdd += array[i];
            }
        }

        System.out.println("Numbers of even: " + counterEven +  "\n" + "The sum of even numbers: " + sumEven +"\n");
        System.out.println("Numbers of odd: " + counterOdd +  "\n" + "The sum of odd numbers: " + sumOdd);

    }

    
}
