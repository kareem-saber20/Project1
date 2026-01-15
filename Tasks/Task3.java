package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    //  use arraylist to enter numbers without duplication

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

        //Output

        System.out.print("Array list: ");

        for(int x : arrayList){

            System.out.print(x + " ");
        }

    }

}
