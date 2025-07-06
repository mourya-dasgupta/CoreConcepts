package miscellaneous;

/**
 * Integer : byte(8bits), short(16bits), int(32bits), long(64bits)
 * Float : float(32bits), double(64bits)
 * Char : char(16bits)  [uses UNICODE and NOT ASCII]
 * Boolean : boolean(8bits)
 */
public class Datatypes {
    public static void main(String[] args) {

        //Integer
        byte a = 12;
        short b = 267;
        int c = 234449;
        long d = 33344444499922l;
        System.out.println(a + "     " + b + "     " + c + "     " + d);

        //Float
        float e = 23.5f;
        double f = 32.44355322;
        System.out.println(e + "     " + f);

        //Character
        char g = 'k';
        System.out.println(g);

        //Boolean
        boolean h = true;
        System.out.println(h);
    }
}
