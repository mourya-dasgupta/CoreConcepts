package array;

/**
 * ArrayList is a resizeable array that stores Objects (autoboxing).
 * Arrays are fixed in size but ArrayList size can be modified.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        //Eg1
        ArrayList list1 = new ArrayList();
        list1.add(56.7);
        list1.add("Tofu");
        System.out.println(list1);

        //Eg2
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Pineapple");
        list2.add("Kiwi");
        list2.add("Mango");
        list2.add("Blueberry");

        list2.remove(2);
        list2.set(2, "Mosambi");

        System.out.println(list2);
        System.out.println(list2.get(1));   //fetches value from list2 at index 1
        System.out.println(list2.size());   //returns size of list2

        Collections.sort(list2);
        System.out.println(list2);

        //Eg3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of foods : ");
        int numOfFoods = sc.nextInt();
        ArrayList<String> list3 = new ArrayList<>();
        for(int i = 0; i < numOfFoods; i++) {
            System.out.print("Enter food number " + i+1 + " : ");
            list3.add(sc.next());
        }
        System.out.println(list3);
    }
}
