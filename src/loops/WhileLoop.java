package loops;

import java.util.Scanner;

/**
 * Initialization
 * Condition
 * Increment/Decrement
 * This is an entry Control Loop
 */
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Eg1
        int i = 5;
        while(i >= 1) {
            System.out.println("i = " + i);
            i--;
        }

        //Eg2
        String name = "";
        while(name.isEmpty()) {
            System.out.print("Please enter your name : ");
            name = sc.nextLine();
        }
        System.out.println("Hello " + name +"\n");

        //Eg3
        String response = "";
        while(!response.equalsIgnoreCase("q")) {
            System.out.println("You are playing an imaginary Game!!!");
            System.out.print("Press Q to exit.");
            response = sc.nextLine();
        }
        System.out.println("You have exited from the Game.");

        //Eg4
        //Ideally Do-While loop was best for the below eg.
        int age = 0;
        System.out.print("\nPlease enter your age : ");
        age = sc.nextInt();
        while(age < 0) {
            System.out.println("Age cannot be negative!");
            System.out.print("Please enter your age again : ");
            age = sc.nextInt();
        }
        System.out.println("Your age is " + age);

    }
}
