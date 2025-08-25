package miscellaneous;

/**
 * Integer : byte(8bits), short(16bits), int(32bits) [default], long(64bits)
 * Float : float(32bits), double(64bits) [default]
 * Char : char(16bits)  [uses UNICODE and NOT only ASCII]
 * Boolean : boolean(8bits)
 *
 * Primitive : Simple values stored directly in Stack memory.
 * Reference : memory address (stored in Stack) that points to the Heap memory.
 */
public class Datatypes {
    public static void main(String[] args) {

        //Integral Number, int is the default datatype
        byte b = 126;
        System.out.println("Byte equivalent to 8 bits.");
        System.out.println("Provided value : " + b);
        System.out.println("Smallest Value : " + Byte.MIN_VALUE);       //-128
        System.out.println("Largest Value : " + Byte.MAX_VALUE);        //127
        System.out.println("-----------------------------------------------------");

        short s = 32456;
        System.out.println("Short equivalent to 16 bits.");
        System.out.println("Provided value : " + s);
        System.out.println("Smallest Positive Value : " + Short.MIN_VALUE);     //-32768
        System.out.println("Largest Positive Value : " + Short.MAX_VALUE);      //32767
        System.out.println("-----------------------------------------------------");

        int i = 1234567898;
        System.out.println("Int equivalent to 32 bits.");
        System.out.println("Provided value : " + i);
        System.out.println("Smallest Positive Value : " + Integer.MIN_VALUE);   //-2147483648
        System.out.println("Largest Positive Value : " + Integer.MAX_VALUE);    //2147483647
        System.out.println("-----------------------------------------------------");

        long l = 987654321012345678l;
        System.out.println("Long equivalent to 64 bits.");
        System.out.println("Provided value : " + l);
        System.out.println("Smallest Positive Value : " + Long.MIN_VALUE);      //-9223372036854775808
        System.out.println("Largest Positive Value : " + Long.MAX_VALUE);       //9223372036854775807
        System.out.println("-----------------------------------------------------");

        //Floating Point, double is the default datatype
        float f = 5456.345678f;    //Supports upto 7 significant digits, then round off
        System.out.println("Float equivalent to 32 bits.");
        System.out.println("Provided value : " + f);
        System.out.println("Smallest Positive Float Value : " + Float.MIN_VALUE);       //1.4E-45
        System.out.println("Largest Positive Float Value : " + Float.MAX_VALUE);        //3.4028235E38
        System.out.println("Smallest Negative Float Value : -" + Float.MIN_VALUE);      //-1.4E-45
        System.out.println("Largest Negative Float Value : -" + Float.MAX_VALUE);       //-3.4028235E38
        System.out.println("-----------------------------------------------------");

        double d = 623456.87697667854557;   //Supports upto 15 significant digits, then round off
        System.out.println("Double equivalent to 64 bits.");
        System.out.println("Provided value : " + d);
        System.out.println("Smallest Positive Double Value : " + Double.MIN_VALUE);     //4.9E-324
        System.out.println("Largest Positive Double Value : " + Double.MAX_VALUE);      //1.7976931348623157E308
        System.out.println("Smallest Negative Double Value : -" + Double.MIN_VALUE);    //-4.9E-324
        System.out.println("Largest Negative Double Value : -" + Double.MAX_VALUE);     //-1.7976931348623157E308
        System.out.println("-----------------------------------------------------");

        //Character
        //Common ASCII values lies from 0-127 range
        //Java supports UNICODE instead of ASCII for char.
        char c = 'k';
        System.out.println("Character equivalent to 2 bits.");
        System.out.println("Provided value : " + c);
        System.out.println("Integer Equivalent : " + c);
        System.out.println("Minimum Value in Integer : " + (int)Character.MIN_VALUE);   //0
        System.out.println("Maximum Value i Integer : " + (int)Character.MAX_VALUE);    //65535
        System.out.println("-----------------------------------------------------");

        //Boolean
        boolean bool = true;
        System.out.println("Boolean equivalent to 1 bit.");
        System.out.println("Provided value : " + bool);
    }
}
