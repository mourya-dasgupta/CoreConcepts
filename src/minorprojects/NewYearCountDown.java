package minorprojects;

import java.util.Scanner;

public class NewYearCountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the seconds for the Countdown : ");
        int countdownSecs = sc.nextInt();

        for(int i = countdownSecs; i >0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR !!!");
    }
}
