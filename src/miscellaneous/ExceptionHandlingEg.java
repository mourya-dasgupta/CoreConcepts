package miscellaneous;

/**
 * Exception is an event that interrupts the normal flow of a program.
 * Eg. : Dividing by zero, file not found, input type mismatch etc
 * Surround any suspected code with a try{} block
 * try{}, catch{}, finally{}
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEg {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {    //normal try{
            System.out.println(450 / 0);
            System.out.print("Enter a number : ");
            int input = sc.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("A number cannot be divided by 0.");
        } catch (InputMismatchException e) {
            System.out.println("You didn't enter a number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}
