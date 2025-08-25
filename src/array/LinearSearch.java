package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];
        System.out.println("Please enter " + size + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Enter the element to be searched : ");
        String target = sc.nextLine();
        boolean isElementFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                System.out.println("Element " + target + " found in Array at index position " + i);
                isElementFound = true;
            }
        }
        if(!isElementFound)
            System.out.println("Element " + target + " NOT found in Array.");
    }
}
