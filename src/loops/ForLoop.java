package loops;

/**
 * Initialization, Condition, Increment/Decrement
 * Entry Control Loop
 */
public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5 ; i++) {
            System.out.println("Day " + i);
            for(int j = 9; j < 18; j++)
                System.out.println("    " + j + " - " + (j+1) + " : ");
        }
    }
}
