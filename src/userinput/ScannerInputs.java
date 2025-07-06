package userinput;

import java.util.Scanner;

public class ScannerInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car ID : ");
        byte id = sc.nextByte();

        System.out.print("Enter number of Gears : ");
        short gears = sc.nextShort();

        System.out.print("Enter Engine CC : ");
        int cc = sc.nextInt();

        System.out.print("Enter discount available : ");
        float discount = sc.nextFloat();

        System.out.print("Enter Price of the Car : ");
        double price = sc.nextDouble();

        System.out.print("Is Discount available? : ");
        boolean hasDiscount = sc.nextBoolean();

        System.out.print("Enter the Brand : ");
        String brand = sc.next();

        //to handle nextLine() issue
        sc.nextLine();

        System.out.print("Enter the Model : ");
        String model = sc.nextLine();

        //Output
        System.out.println(brand + " presents " + model + " with Car Id " + id + " have " + gears + " gears with an Engine capacity of " +
                cc + "cc.");
        System.out.println("Price of the Car is " + price);
        System.out.println("Discount Available : " + discount);
        if(hasDiscount)
            System.out.println("Discounted Price : " + (price - (price*discount/100)));
        sc.close();
    }
}
