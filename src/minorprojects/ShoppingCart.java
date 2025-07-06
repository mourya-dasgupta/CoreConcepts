package minorprojects;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~ Today's Menu ~~");
        System.out.println(" Pizza \n Pasta \n Burger \n Sandwich\n");
        System.out.print("What would you like to order? : ");
        String item = sc.nextLine();
        System.out.print("How many you would like to order? : ");
        int quantity = sc.nextInt();
        double totalBill;

        switch(item.toLowerCase()) {
            case "pizza" : totalBill = 400 * quantity;
            break;
            case "pasta" : totalBill = 300 * quantity;
            break;
            case "burger" : totalBill = 200 * quantity;
            break;
            case "sandwich" : totalBill = 100 * quantity;
            break;
            default: totalBill = 0;
        }

        if(totalBill > 0)
            System.out.println("Hi, You have bought " + quantity + " " + item.toUpperCase() + " and your bill amount is INR " + totalBill);
    }
}
