package oopsconcept;

/**
 * Static methods or variables belong to the Class rather than the instances of the class.
 * While calling a static method or static variable, we need to call them using the Class name itself.
 * Commonly used for utility methods or shared resources. Eg. round() in Math Class
 */
public class StaticKeywordEg {
    public static void main(String[] args) {
        Macbook m1 = new Macbook();
        Macbook m2 = new Macbook("M2");
        Macbook m3 = new Macbook("M3", 130000);

        System.out.println(Macbook.numOfMacbooks);
        Macbook.showMacbooks();
    }
}
