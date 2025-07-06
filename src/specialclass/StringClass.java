package specialclass;

/**
 * Strings are Immutable.
 * Every String Literal is a constant in Java. They are stored in a table called String Constant Pool inside Heap memory.
 * When we try to modify a String literal, a new constant is being created inside String Constant Pool in Heap memory and in Stack memory the reference address gets modified.
 * Java is case-sensitive so "Mourya" and "mourya" are different.
 */
public class StringClass {
    public static void main(String[] args) {

        String name1 = new String("Mourya");
        String name2 = "Sourya";
        //In stack memory name1 and name2 will be created which will point out to the respective reference addresses of the objects in Heap memory.

        //concatenation
        System.out.println("Hello " + name2);
    }
}
