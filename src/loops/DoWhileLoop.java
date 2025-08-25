package loops;

import java.util.Scanner;

/**
 * Initialization
 * Increment/Decrement
 * Condition
 * ~
 * Will be executed at least once.
 * This is an exit Control Loop
 */
public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Eg1
        int i = 500;
        do {
            System.out.println("i = " + i);
            i /= 5;
        } while (i > 0);

        //Eg2
        int age = 0;
        do{
            System.out.print("Please enter your age : ");
            age = sc.nextInt();
        } while(age<0);
        System.out.println("Your age is " + age);
    }
}
