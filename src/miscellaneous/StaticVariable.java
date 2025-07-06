package miscellaneous;

/**
 * Static variables are accessed using Classname but can also be called using objects.
 * Static variables are shared by all the objects. They belong to Class and not the objects.
 * We can use static variables in non-static methods.
 */

class Mobile {
    String brand;
    double price;
    String modelName;
    static String typeOfPhone;

    public void showAll() {
        System.out.println(brand + " | " + price + " | " + modelName + " | " + typeOfPhone);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1_40_000;
        m1.modelName = "IPhone 16 Pro";
        Mobile.typeOfPhone = "Smart Phone";
        m1.showAll();

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1_20_000;
        m2.modelName = "S25 Ultra";
        Mobile.typeOfPhone = "Smart Phone";
        m2.showAll();
    }
}
