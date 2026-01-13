package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class NewTask2 {
    
    public static void main(String[] args) {

        int counterEven = 0;
        int sumEven = 0;

        int counterOdd = 0;
        int sumOdd = 0;

        
        Scanner input = new Scanner(System.in);

        System.out.print("Number of items: ");

        int n = input.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        System.out.print("Enter " + n +  " numbers: "  );
        
        int value;

        for(int i = 0; i < n ; i++){

            value = input.nextInt();
            arrayList.add(value);

            if(value % 2 == 0){
                
                counterEven++;
                sumEven+= value;
            }
            
            else{
                
                counterOdd++;
                sumOdd+= value;                

            }

        }

        arrayList.sort(null);

        System.out.print("\n" + "Array list sorted: ");

        for(int x : arrayList){

            System.out.print(x + " ");
        }

        System.out.println("\n" + "\n"+ "Min number: " + arrayList.get(0) + "\n" + "Max number: " + arrayList.get(arrayList.size()-1) + "\n" + "\n" );

        System.out.println("Numbers of even: " + counterEven +  "\n" + "The sum of even numbers: " + sumEven +"\n");
        
        System.out.println("Numbers of odd: " + counterOdd +  "\n" + "The sum of odd numbers: " + sumOdd);
    }
    
}
