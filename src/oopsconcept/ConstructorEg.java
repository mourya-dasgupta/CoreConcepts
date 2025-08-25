package oopsconcept;

/**
 * A special member function which has same name as the class name and doesn't have any return type.
 * It is mainly used to initialize objects. One can pass arguments to a constructor to set up initial values.
 * It is automatically called when we create a new object but number of arguments should match..
 */

//Linked to Macbook Class
public class ConstructorEg {
    public static void main(String[] args) {
        Macbook mac1 = new Macbook("M1", 70000, "Space Grey");
        mac1.infoDisplay();
        mac1.switchOn();
        mac1.playGames();
        mac1.switchOff();

        System.out.println();
        Macbook mac2 = new Macbook("M2", 90000, "Blue");
        mac2.infoDisplay();
        mac2.switchOn();
        mac2.playGames();
        mac2.switchOff();

        System.out.println();
        Macbook m3 = new Macbook("M3");
        m3.infoDisplay();

        System.out.println();
        Macbook m4 = new Macbook("M4", 1_10_000);
        m4.infoDisplay();

        System.out.println();
        Macbook m5 = new Macbook();
        m5.infoDisplay();
    }
}
