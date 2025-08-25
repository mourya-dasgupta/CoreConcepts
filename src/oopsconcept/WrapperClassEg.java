package oopsconcept;

/**
 * Wrapper Classes allows primitive values(int, char, double, boolean) to be used as objects. "Wraps them in an Object"
 * Generally, don't wrap primitives unless you need an Object.
 * Allows use of Collection Framework and static utility Methods.
 * Autoboxing : Wrapping up a primitive within an Object.
 * Unboxing : Unwrapping up the Object into its primitive datatype.
 */
public class WrapperClassEg {
    public static void main(String[] args) {
        //Depreciated since Java 9
        /*Integer a = new Integer(123);
        Double b = new Double(123.456);
        Character c = new Character('r');
        Boolean d = new Boolean(true);*/

        //Autoboxing (Here a,b,c and d are objects of the following datatypes)
        Integer a = 123;
        Double b = 123.456;
        Character c = 'r';
        Boolean d = false;

        //Unboxing
        int m = a;
        double n = b;
        char o = c;
        boolean p = d;

        //Utility of Wrapper Classes
        String w = Integer.toString(567);
        String x = Double.toString(567.765);
        String y = Character.toString('m');
        String z = Boolean.toString(true);
        System.out.println( w + x + y + z);

        //Parse Methods
        int q = Integer.parseInt(w);
        double r = Double.parseDouble(x);
        char s = "Bread".charAt(0); //Parse method not present for Character
        boolean t = Boolean.parseBoolean("true");
        System.out.println(q);

        //Character Utility Methods
        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isUpperCase('K'));
        System.out.println(Character.isLetter('h'));
        System.out.println(Character.isSpaceChar(' '));
    }
}
