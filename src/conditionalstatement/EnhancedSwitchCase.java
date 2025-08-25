package conditionalstatement;

//It is introduced in Java 14.
//Use curly braces for multi-line in cases
import java.util.Scanner;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week : ");
        String day = sc.next().toUpperCase();

        switch(day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
                System.out.println("GOSH !!");
                System.out.println("It is a Weekday 😒");
            }
            case "SATURDAY", "SUNDAY" ->
                System.out.println("It is the Weekend 😁");
            default ->
                System.out.println("Not a valid day.");
        }
    }
}
