package minorprojects;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        Random random = new Random();

        int numberOfDices = 1;

        String choice;
        do {
            System.out.println( "Press R to roll.");
            System.out.println( "Press D to select the number of Dices.");
            System.out.println( "Press any other key to Exit.");

            choice = sc.next();
            switch (choice.toUpperCase()) {
                case "R":
                    for (int i = 1; i <= numberOfDices; i++) {
                        System.out.println(random.nextInt(1, 7));
                    }
                    break;
                case "D":
                    System.out.print("Enter the number of Dices : ");
                    numberOfDices = sc.nextInt();
                    break;
                default:
                    System.out.println("Thank you for Playing!!");
            }
        }while(choice.equalsIgnoreCase("R") || choice.equalsIgnoreCase("D"));
    }
}
