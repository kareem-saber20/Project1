package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    //  use arraylist to enter numbers without duplication and sort it
    public static void main(String[] args) {

        //Input 

        Scanner input = new Scanner(System.in);

        System.out.print("Number of items: ");

        int n = input.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        System.out.print("Enter " + n + " numbers: "  );    

        
        //Processing

        // enter new numbers and prevent duplication

        int value;

        for(int i = 0; i < n ; i++){

            value = input.nextInt();

            if(!arrayList.contains(value)){

            arrayList.add(value);

            }
        }
        
        arrayList.sort(null);

        //Output

        System.out.print("Array list sorted : ");

        for(int x : arrayList){

            System.out.print(x + " ");
        }

    }
    
}
