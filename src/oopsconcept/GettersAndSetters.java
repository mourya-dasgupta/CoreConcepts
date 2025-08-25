package oopsconcept;

/**
 * They help protect Object data and add rules for accessing or modifying them.
 * GETTERS are methods that make a field READABLE.
 * SETTERS are methods that make a field WRITEABLE.
 */
public class GettersAndSetters {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Aparupa", 2, 2500000, "Orange");
        System.out.println(apartment1.toString());

        System.out.println();
        apartment1.setPrice(3200000);
        apartment1.setColour("Blue");
        System.out.println(apartment1.toString());
    }
}

class Apartment {
    private final String name;
    private final int numberOfRooms;
    private double price;
    private String colour;

    Apartment(String name, int numberOfRooms, double price, String colour) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.colour = colour;
    }

    String getName() {
        return name;
    }
    String getNumberOfRooms() {
        return numberOfRooms + "BHK";
    }
    String getPrice() {
        return "INR " + price;
    }
    String getColour() {
        return colour;
    }

    void setPrice(double price) {
        if(price < 0)
            System.out.println("Price cannot be negative.");
        else
            this.price = price;
    }
    void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return this.name + " is a " + this.getNumberOfRooms() + " apartment, " + this.getColour()
                + " in colour and priced at " + this.getPrice() + ".";
    }
}
