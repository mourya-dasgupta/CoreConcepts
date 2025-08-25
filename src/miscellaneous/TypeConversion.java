package miscellaneous;

/**
 * Also known as Widening Conversion
 * Implicit : Conversion
 * When we try to assign a value of small datatype to a variable of large datatype, the conversion happens IMPLICITLY.
 */
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;   //cup
        short s = b;    //mug
        int i = s;      //jug
        long l = i;     //bucket

        float f = l;
        double d = l;

        System.out.println("Byte : " + b + "\nShort : " + s + "\nInteger : " + i + "\nLong : " + l + "\nFloat : " + f + "\nDouble : " + d);
    }
}
