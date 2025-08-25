package oopsconcept;

/**
 * Interface is a blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
 * It supports multiple inheritance like behaviour.
 */

//Linked to Macbook Class
interface Computer{
    void switchOn();
    void switchOff();
}

interface Laptop{
    void charge();
}
public class InterfaceEg {
    public static void main(String[] args) {
        Macbook mac1 = new Macbook("M1", 70000, "Space Grey");
        Macbook mac2 = new Macbook("M2", 90000, "Blue");
        Thinkpad thinkpad1 = new Thinkpad("T500", 62500, "Pink");
        Thinkpad thinkpad2 = new Thinkpad("T600", 87500, "Red");
        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(thinkpad1.toString());
        System.out.println(thinkpad2.toString());
        thinkpad1.charge();
        thinkpad2.charge();
    }
}

class Thinkpad implements Computer, Laptop{
    String model;
    double price;
    String colour;
    Thinkpad(String model, double price, String colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }
    @Override
    public void switchOn() {
        System.out.println("Switching On " + model);
    }

    @Override
    public void switchOff() {
        System.out.println("Switching Off " + model);
    }

    public String toString() {
        return "Model : " + model + " Price : " + price + ",  Colour : " + colour;
    }

    @Override
    public void charge() {
        System.out.println(model + " Charging.");
    }
}
