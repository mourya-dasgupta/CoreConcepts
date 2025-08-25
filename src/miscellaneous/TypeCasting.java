package miscellaneous;

/**
 * Also known as Narrowing Conversion
 * Explicit : Casting
 * When we try to assign a value of big datatype to a variable of small datatype, the casting needs to be done EXPLICITLY.
 * Although there is a restriction is casting. for eg: we cannot cast string to integer
 */
public class TypeCasting {
    public static void main(String[] args) {
        int a = 20;
        byte b = (byte)a; //This statement will throw an error unless we type cast the value of variable 'a' to 'byte' explicitly
        System.out.println(b);

        float f = 13.745f;
        int i = (int)f; //This statement will throw an error unless we type cast the value of variable 'f' to 'int' explicitly
        System.out.println(i);

        //Overflow will happen if the value of m exceeds the range of float datatype
        double m = 123.456;     //bucket
        float n = (float)m;     //mug      //Narrowing Conversion from Double to Float

        //Overflow will definitely happen here as float supports decimal precision whereas long or int doesn't
        long o = (long)n;    //Narrowing Conversion from float to long
        int p = (int)o;     //Narrowing Conversion from long to int
    }
}
