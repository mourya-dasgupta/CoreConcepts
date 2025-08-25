package userinput;

import java.util.Scanner;

/**
 * Issue : In Scanner class issue with nextLine() occurs when we use any other next() method before using nextLine()
 * Resolution : Use an extra nextLine() to consume the extra '\n'
 * eg: int input = scanner.nextInt();
 *     sc.nextLine();           //resolution to consume the enter pressed after entering the value for input
 *     String display = scanner.nextLine();
 */
public class ScannerIssue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        /* Problem stated below.
           Acting resolution to consume the "/n" from buffered memory
         */
        sc.nextLine();

        System.out.print("Enter your favourite colour : ");
        String colour = sc.nextLine();

        /* Suppose we give the value "33\n" (Enter 33 and press enter to proceed),
           Here nextInt() will only read 33 and keep the '\n' in the buffered memory,
           thus when in the next line we are seeking value from nextLine(),
           '\n' from buffered memory is acting as an input to nextLine().
           So the control is not waiting for our actual keyboard input.
        */

        System.out.println("Age : " + age);
        System.out.println("Fav Colour : " + colour);

        sc.close();
    }
}