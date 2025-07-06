package miscellaneous;

/**
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
    }
}
