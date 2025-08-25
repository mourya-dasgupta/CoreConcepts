package minorprojects;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineGame {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static double winnings = 0;
    public static void main(String[] args) {

        String[] symbols = {"🍇", "🍋", "🍉", "⭐", "💰"};
        double balance;
        String topUpRequired;
        String playAgain = "Y";
        int choice;
        double bet;
        String[] spinResult;
        double amountWon = 0;
        double initialBalance =0;

        System.out.println("****************************");
        System.out.println("Welcome to SLOT MACHINE game");
        System.out.println("****************************");
        System.out.print("\nEnter the amount you want to buy in : INR ");
        balance = sc.nextDouble();
        initialBalance = balance;

        do{
            System.out.println("\nPress 1 to Spin.");
            System.out.println("Press 2 to check Balance.");
            System.out.println("Press 3 to add Top-Up.");
            System.out.println("Press 4 to Exit.");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Enter the Amount you want to bet : ");
                bet = sc.nextDouble();
                if(bet == 0.00) {
                    System.out.println("Bet Amount cannot be INR 0.00 !!");
                    continue;
                } else if(bet < 0) {
                    System.out.println("Bet Amount cannot be negative!!");
                    continue;
                } else if(bet > balance) {
                    System.out.println("Insufficient Balance for placing the bet!!");
                    System.out.println("Do you want a Top-Up (Y/N) ?");
                    topUpRequired = sc.next().toUpperCase();
                    if(topUpRequired.equals("Y")) {
                        balance = topUp(balance);
                        continue;
                    }
                    else if(topUpRequired.equals("N"))
                        continue;
                    else
                        break;
                }else {
                    spinResult = spin(symbols);    //spinning
                }
                display(spinResult);    //displaying the result
                amountWon = calculateResult(spinResult, bet);   //calculating the result and displaying balance
                balance += amountWon;
            } else if(choice == 2) {
                System.out.println("Balance : INR " + balance);
            } else if(choice == 3) {
                balance = topUp(balance);
            } else if(choice == 4) {
                break;
            } else {
                System.out.println("INVALID Input!!");
                break;
            }

            System.out.print("Do you want to Play again (Y/N) : ");
            playAgain = sc.next().toUpperCase();
            if(!(playAgain.equals("Y") || playAgain.equals("N"))) {
                System.out.println("Invalid Response!!");
                playAgain = "Y";
            } else if(playAgain.equals("N"))
                break;
        }while(playAgain.equals("Y"));

        System.out.println("\nInitial Balance : INR " + initialBalance);
        System.out.println("Total Winnings : INR " + winnings);
        System.out.println("Available balance : INR " + balance);
        System.out.println("\nThank you for Playing!!");
    }

    static double topUp(double balance) {
        System.out.print("Enter the amount : INR ");
        double topUp = sc.nextDouble();
        if (topUp >= 0) {
            balance += topUp;
            System.out.println("Top-Up of INR " + topUp + " Successful.");
            System.out.println("Updated Balance : INR " + balance);
        } else
            System.out.println("Top-Up Unsuccessfull!!");
        return balance;
    }

    static String[] spin(String[] symbols) {
        String[] result = new String[3];
        for(int i = 0; i < 3; i++) {
            result[i] = symbols[random.nextInt(5)];
        }
        return result;
    }

    static void display(String[] result) {
        System.out.println("**************");
        System.out.print(String.join(" | ", result));
        System.out.println("\n**************");
    }

    static double calculateResult(String[] result, double bet) {
        double winningAmount = 0;
        if(result[0].equals(result[1]) && result[1].equals(result[2])) {
             switch(result[0]) {
                case "🍇" -> winningAmount = bet * 2;
                case "🍋" -> winningAmount = bet * 3;
                case "🍉" -> winningAmount = bet * 5;
                case "️️⭐" -> winningAmount = bet * 10;
                case "💰" -> winningAmount = bet * 20;
                default -> winningAmount = 0 ;
            }
        } else if(result[0].equals(result[1]) || result[1].equals(result[2])) {
            switch(result[1]) {
                case "🍇" -> winningAmount = bet * 1;
                case "🍋" -> winningAmount = bet * 2;
                case "🍉" -> winningAmount = bet * 3;
                case "️️⭐" -> winningAmount = bet * 5;
                case "💰" -> winningAmount = bet * 8;
                default -> winningAmount = 0 ;
            }
        }
        else{
            System.out.println("You LOST!!");
            return -bet;
            }
        System.out.println("*******************");
        System.out.println("You WON INR " + winningAmount );
        System.out.println("*******************");
        winnings += winningAmount;
        return winningAmount;
    }
}
