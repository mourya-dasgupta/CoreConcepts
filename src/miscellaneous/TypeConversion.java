package miscellaneous;

/**
 * Implicit : Conversion
 * When we try to assign a value of small datatype to a variable of large datatype, the conversion happens IMPLICITLY.
 */
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;

        float f = l;
        double d = l;

        System.out.println("Byte : " + b + "\nShort : " + s + "\nInteger : " + i + "\nLong : " + l + "\nFloat : " + f + "\nDouble : " + d);
    }
}
