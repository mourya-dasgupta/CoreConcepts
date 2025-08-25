package minorprojects;

import java.util.Scanner;
public class BankingSystem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        int choice = 0;
        boolean isRunning = true;

        System.out.println("Welcome to DBS Bank");
        System.out.print("PLease enter your A/C balance : ");
        balance = sc.nextDouble();

        while(isRunning) {
            System.out.println("Press 1 to check balance.");
            System.out.println("Press 2 to deposit money.");
            System.out.println("Press 3 to withdraw money.");
            System.out.println("Press 4 to exit.");

            choice = sc.nextInt();

            switch(choice) {
                case 1 ->   showBalance(balance);
                case 2 ->   balance = deposit(balance);
                case 3 ->   balance = withdrawal(balance);
                case 4 ->   isRunning = false;
                default ->  System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    static void showBalance(double balance){
        System.out.println("Balance : INR " + balance);
    }
    static double deposit(double balance) {
        System.out.println("Please enter the amount to be deposited : ");
        double amount = sc.nextDouble();
        if(amount >= 0) {
            balance += amount;
            System.out.println("Updated balance : INR " + balance);
        }
        else
            System.out.println("Invalid amount entered.");
        return balance;
    }
    static double withdrawal(double balance) {
        System.out.print("Please enter the amount for withdrawal : ");
        double amount = sc.nextDouble();
        if(amount >= 0) {
            if(amount > balance) {
                System.out.println("Insufficient balance!!");
            } else {
                balance -=amount;
                System.out.println("Updated balance : INR " + balance);
            }
        }
        else
            System.out.println("Invalid amount entered.");
        return balance;
    }
}