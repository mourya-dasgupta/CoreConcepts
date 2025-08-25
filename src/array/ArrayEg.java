package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Rules
        String[] games = {};    //Empty Initialization of an array, cannot store any value further or change size later.
        //games[1] = "Tennis";  //Throws ArrayIndexOutOfBound exception thrown

        //Eg1
        String[] foods = new String[3];
        foods[0] = "Biriyani";
        foods[1] = "Kebab";
        foods[2] = "Roll";
        System.out.println(Arrays.toString(foods));

        //Eg2
        System.out.println("Enter Array size : ");
        int size = sc.nextInt();
        sc.nextLine();
        String element;
        String[] integerArray;
        integerArray = new String[size];
        for(int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter array element number "+ (i+1) + " : ");
            element = sc.nextLine();
            integerArray[i] = element;
        }
        System.out.println(Arrays.toString(integerArray));

        //Eg3
        String[] fruits = {"Pineapple", "Orange", "Apple", "Mango", "Grapes"};
        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
