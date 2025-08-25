package array;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        //Eg1
        int[] arr = {1,2,3,4,5,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Eg2
        String[] fruits = {"Pineapple", "Orange", "Apple", "Mango", "Grapes"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        Arrays.fill(fruits,"Guava");
        System.out.println(Arrays.toString(fruits));
    }
}