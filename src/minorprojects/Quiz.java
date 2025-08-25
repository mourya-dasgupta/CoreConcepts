package minorprojects;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String questions[] = {"What is the main function of a router?",
                              "Which part of the computer is considered as the brain?",
                              "Which year was Facebook launched?",
                              "Who is known as the father of Computer?",
                              "What was the first commercial available Programming Language?"};

        String answers[][] = {{"1. Storing Files", "2. Encrypting Data", "3. Directing Internet Traffic", "4. Managing Passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. Cobol", "2. C", "3. Fortran", "4. Assembly"}};

        int[] correctAnswers = {3,1,2,4,3};
        int guess;
        int score = 0;

        System.out.println("~~~~Welcome to QUIZ~~~");
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for(String ans : answers[i])
                System.out.println(ans);
            System.out.print("Enter your guess : ");
            guess = sc.nextInt();
            if(guess == correctAnswers[i]) {
                System.out.println("*** CORRECT ANSWER ***\n");
                score++;
            } else
                System.out.println("*** WRONG ANSWER ***\n");
        }
        System.out.println("You scored " + score + " out of " + questions.length);
    }
}
