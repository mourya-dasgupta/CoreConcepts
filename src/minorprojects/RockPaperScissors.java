package minorprojects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playAgain = "y";
        int gamesPlayed = 0;
        int won = 0;
        int lost = 0;
        int tie = 0;
        String userChoice;
        String computerChoice;

        do {
            System.out.print("Enter your choice (rock/paper/scissors) : ");
            userChoice = sc.next().toLowerCase();
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer's Choice : " + computerChoice);

            if(!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.println("Invalid Input!");
            } else if(userChoice.equals(computerChoice)) {
                System.out.println("Game TIED!!");
                gamesPlayed++;
                tie++;
            } else if((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You WON!!!");
                gamesPlayed++;
                won++;
            } else {
                System.out.println("You LOST!!!");
                gamesPlayed++;
                lost++;
            }

            System.out.print("\nPlay again (Y/N) ? : ");
            playAgain = sc.next().toLowerCase();
            if(!(playAgain.equals("y") || playAgain.equals("n"))) {
                System.out.println("Invalid Response!!");
                break;
            }

        }while(playAgain.equals("y"));
        System.out.println("\nBelow is your Score!!");
        System.out.println("Total Games PLAYED : " + gamesPlayed);
        System.out.println("You WON " + won + " games.");
        System.out.println("You LOST " + lost + " games.");
        System.out.println("You TIED " + tie + " games.");
        System.out.println("Thank you for playing 😀");
    }
}
