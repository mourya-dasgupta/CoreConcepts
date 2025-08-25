package minorprojects;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(1, 101);
        int guess = 0;
        int numOfAttempts = 0;

        System.out.println("Guess a number between 1-100 !!");
        do {
            numOfAttempts++;
            System.out.print("Enter your guess : ");
            guess = sc.nextInt();

            if (guess == num)
                System.out.println("Congrats you guessed it correctly at attempt number " + numOfAttempts + " !!");
            else if (guess >= 1 && guess <= 100) {
                if (guess > num)
                    System.out.println("Too High. Try Again!!");
                else
                    System.out.println("Too Low. Try Again!!");
            } else
                System.out.println("Invalid Input!!");
        } while (guess != num);
        sc.close();
    }
}
