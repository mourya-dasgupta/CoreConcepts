package oopsconcept;

//Linked to AnonymousObjects Class
//Linked to InterfaceEg Class
//Linked to ConstructorEg Class
public class Macbook implements Computer{
    static int numOfMacbooks;
    String model;
    double price;
    String colour;

    void playGames() {
        System.out.println("Playing games in " + model);
    }
    @Override
    public void switchOn() {
        System.out.println("Switching On " + model);
    }
    @Override
    public void switchOff() {
        System.out.println("Switching Off " + model);
    }
    void infoDisplay() {
        System.out.println(model + " is a " + colour + " colour Macbook and costs INR " + price);
    }
    static void showMacbooks(){
        //instead of this.numOfMacbooks we can use the variable name directly as it is a static variable
        System.out.println("Number of Macbooks : " + numOfMacbooks);
    }

    public String toString() {
        return "Model : " + model + " Price : " + price + ",  Colour : " + colour;
    }

    Macbook(String model, double price, String colour){
        this.model = model;
        this.price = price;
        this.colour = colour;
        numOfMacbooks++;
    }

    Macbook(String model) {
        this.model = model;
        this.price = 0;
        this.colour = "TBD";
        numOfMacbooks++;
    }

    Macbook(String model, double price) {
        this.model = model;
        this.price = price;
        this.colour = "TBD";
        numOfMacbooks++;
    }

    Macbook() {
        this.model = "M5";
        this.price = 120000;
        this.colour = "Grey";
        numOfMacbooks++;
    }
}
