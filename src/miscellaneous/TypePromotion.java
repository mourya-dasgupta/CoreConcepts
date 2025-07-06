package miscellaneous;

/**
 * Type promotion happens Implicitly
 * #When we perform arithmetic operations on a particular datetype, the small datatype gets converted to the big datatype IMPLICITLY
 * #When we perform arithmetic operatic on a datatype and the resultant value cross the range of that datatype, the output will be obtained by reult % range of that datatype
 */
public class TypePromotion {
    public static void main(String[] args) {
        byte a = 100;
        byte b = 20;
        int c = 30;

        //Here we are performing arithmetic operation on byte and int variables together so the result is implicitly getting converted to int
        int sum = a + b + c;
        System.out.println(sum);

        //Here the result is exceeding the upper limit of byte range. Thus, the result is obtained by output % 256(range of byte)
        byte res = (byte) (a*b);
        System.out.println(c);

        int result = a*b;
        System.out.println(result);


    }
}
