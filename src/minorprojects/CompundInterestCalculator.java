package minorprojects;

import java.util.Scanner;

public class CompundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter Principal : INR ");
        principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest in %) : ");
        rate = sc.nextDouble() / 100;
        System.out.print("Enter the number of times compounded in a year : ");
        timesCompounded = sc.nextInt();
        System.out.print("Enter number of years : ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + (rate / timesCompounded),(timesCompounded * years));
        System.out.printf("The Principal of INR %,.2f in %d years at %.2f %% rate of interest by compounding %d times a year amounts to INR %,.2f ", principal,years,rate,timesCompounded,amount);

        sc.close();
    }
}
