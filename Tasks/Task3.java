package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.print("Number of items: ");

        int n = input.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        System.out.print("Enter " + n + " numbers: "  );

        // enter new numbers and prevent dublication

        int value;

        for(int i = 0; i < n ; i++){

            value = input.nextInt();

            if(!arrayList.contains(value)){

            arrayList.add(value);

            }
        }

        System.out.print("Array list: ");

        for(int x : arrayList){

            System.out.print(x + " ");
        }

    }

}
