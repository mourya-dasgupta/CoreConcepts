package conditionalstatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter day number (1-7) : ");
        int day = sc.nextInt();
        switch(day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Input!!");
        }

        System.out.print("Please enter a/b/c : ");
        char choice = sc.next().charAt(0);

        switch(choice) {
            case 'a' :
                System.out.println("It's A.");
                break;
            case 'b' :
                System.out.println("It's B.");
                break;
            case 'c' :
                System.out.println("It's C.");
                break;
            default :
                System.out.println("Invalid Input");
        }

        System.out.print("Please enter your name : ");
        String name = sc.next();
        switch(name.toLowerCase()) {
            case "mukesh" :
                System.out.println("It's Pappa.");
                break;
            case "jayasri" :
                System.out.println("It's Mamma.");
                break;
            case "sourya" :
                System.out.println("It's Brother.");
                break;
            case "mourya" :
                System.out.println("It's You.");
                break;
            default :
                System.out.println("Not a family member.");
        }

        System.out.println("Enter the day of the week : ");
        String dayOfTheWeek = sc.next().toUpperCase();

        switch(dayOfTheWeek) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" :
                    System.out.println("It is a Weekday 😒");
                    break;
            case "SATURDAY", "SUNDAY" :
                    System.out.println("It is the Weekend 😁");
                    break;
            default :
                    System.out.println("Not a valid day.");
        }
    }
}
