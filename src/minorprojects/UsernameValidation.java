package minorprojects;

import java.util.Scanner;

/**
 * Username must be between 4-12 characters
 * Username can contain letters and numbers only
 * Username cannot contain blank space
 * Username cannot contain special characters
 */
public class UsernameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an username : ");
        String username = sc.nextLine();

        if(username.length() < 4 || username.length() > 12)
            System.out.println("Username must be between 4-12 characters.");
        else if(username.contains(" ") || username.contains("@") || username.contains("$") || username.contains("_"))
            System.out.println("Username cannot have spaces or special characters.");
        else
            System.out.println("Welcome " + username + " !!");
    }
}
