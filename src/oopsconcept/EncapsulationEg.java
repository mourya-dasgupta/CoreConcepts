package oopsconcept;

/**
 * Encapsulation in Java is a mechanism of wrapping up of the data(variables) and code acting on the data(methods) together as a single unit.
 * In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
 * Therefore, it is also known as data hiding. To achieve encapsulation we need to fulfill the below two criteria :
 *  • Declare the variables of a class as private.
 * 	• Provide public setter and getter methods to modify and retrieve the variables values.
 */
class Car {
    private int speed;
    private String colour;
    private String company;

    //default implicit constructor
    public Car(){

    }

    //parameterized constructor
    public Car(String company) {
        this.company = company;
    }
    void drive(){
        System.out.println("Driving..");
    }

   public void setSpeed(int speed) {
        if(speed < 0)
            System.out.println("Not Possible");
        else
            this.speed = speed;
   }
   public int getSpeed() {
        return speed;
   }
   public void setColour(String colour) {
        this.colour = colour;
   }
   public String getColour() {
        return colour;
   }
   public String getCompany() {
        return company;
   }
}
public class EncapsulationEg {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        car1.setSpeed(240);
        car1.setColour("Red");
        Car car2 = new Car("Audi");
        car2.setSpeed(310);
        car2.setColour("White");
        System.out.println("Company : " + car1.getCompany() + "\nSpeed : " + car1.getSpeed() + "\nColour : " + car1.getColour());
        car1.drive();
        System.out.println("\nCompany : " + car2.getCompany() + "\nSpeed : " + car2.getSpeed() + "\nColour : " + car2.getColour());
        car2.drive();
    }
}
