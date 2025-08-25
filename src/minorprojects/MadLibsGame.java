package minorprojects;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an adjective (description) : ");
        String adj1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person) : ");
        String noun = sc.nextLine();
        System.out.print("Enter an adjective (description) : ");
        String adj2 = sc.nextLine();
        System.out.print("Enter a verb ending with -ing (action) : ");
        String verb = sc.nextLine();
        System.out.print("Enter an adjective (description) : ");
        String adj3 = sc.nextLine();

        System.out.println("\nToday I went to a " + adj1 + " zoo.");
        System.out.println("In an exhibit I saw a " + noun + ".");
        System.out.println(noun + " was " + adj2 + " and " + verb + "!");
        System.out.println("I was " + adj3 + "!");

        sc.close();
    }
}
