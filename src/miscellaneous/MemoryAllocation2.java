package miscellaneous;

/**
 * In HEAP memory there is a small dedicated part called String Pool where the String Literals gets stored.
 * Inside Heap Memory there is a String Pool where the literals gets stored for the purpose to reuse.
 * When we create a String Literal, it checks whether the literal is already been present in String Pool. If not, it creates one.
 */
public class MemoryAllocation2 {
    public static void main(String[] args) {
        String a = "Mourya";
        String b = "Mourya";
        String c = new String("Mourya");

        System.out.println(a==b);           //true (same reference in String Pool)
        System.out.println(a==c);           //false (different objects)
        System.out.println(a.equals(c));    //true (same content)

        a = a.toUpperCase();            //creates new string
        System.out.println(a==b);       //false (different objects)
    }
}

/**
 * ~~In the above program, in line 10 an object "Mourya" is being created in String Pool.
 * Again in line 11 when we tried to create another literal with the same content, it doesn't create a new one and
 * thus refer to the already existing one from the String Pool. Thus, a and b are both pointing to a same memory address
 * in Heap memory from String Pool.
 * ~~In line 15, when we are comparing object a with c, both are pointing to two different memory addresses thus comparison results in false.
 * ~~In line 16, the content of object a is being compared with the content of object c thus it is returning true.
 * ~~In line 18, we are re-initializing a with toUppercase() method which converts all the letters to capital letters. Here the existing
 * string "Mourya" from string pool is not getting affected. Instead a new string "MOURYA" in being created in string pool. So when we
 * are trying to compare object a which got reinitialized to object b, we get false as both are pointing to two different memory
 * addresses now.
 * Thus String is immutable.
 */
