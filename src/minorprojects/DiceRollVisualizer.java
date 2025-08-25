package minorprojects;

import java.util.Random;
import java.util.Scanner;

public class DiceRollVisualizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter the number of dices : ");
        int numOfDices = sc.nextInt();
        int roll = 0;
        for(int i = 0; i < numOfDices; i++) {
            roll = random.nextInt(1,7);
            rollVisualizer(roll);
            System.out.println("You rolled a " + roll);
        }
        sc.close();
    }
    static void rollVisualizer(int roll) {
        String dice1 = """
                 ---------
                |         |
                |    🛑   |
                |         |
                 ---------
                """;
        String dice2 = """
                 ---------
                |  🛑     |
                |         |
                |      🛑 |
                 ---------
                """;
        String dice3 = """
                 ---------
                |  🛑     |
                |    🛑   |
                |      🛑 |
                 ---------
                """;
        String dice4 = """
                 ---------
                | 🛑   🛑|
                |         |
                | 🛑   🛑|
                 ---------
                """;
        String dice5 = """
                  ---------
                | 🛑   🛑|
                |    🛑   |
                | 🛑   🛑|
                 ---------
                """;
        String dice6 = """
                 ---------
                | 🛑   🛑|
                | 🛑   🛑|
                | 🛑   🛑|
                 ---------
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }
}
