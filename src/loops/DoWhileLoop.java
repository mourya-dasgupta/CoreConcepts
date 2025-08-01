package loops;

/**
 * Initialization
 * Increment/Decrement
 * Condition
 * ~
 * Will be executed at least once.
 * This is an exit Control Loop
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 500;
        do {
            System.out.println("i = " + i);
            i /= 5;
        } while (i > 0);
    }
}
