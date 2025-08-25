package miscellaneous;

/**
 * printf() is a method used to format output.
 *  %[flags][width][.precision][specifier-character]
 *  ~flags~
 *  '+' [returns positive or negative sign based on the number]
 *  ',' [comma grouping separator]
 *  '(' [negative number are enclosed in brackets()]
 *  ' ' [display a minus if negative, otherwise blank space, to maintain a significant left line
 *  ~width~
 *  0 [zero padding from left to make vertical alignment]
 *  number [right justified padding, padding with black spaces]
 *  negative number [left justified padding]
 */
public class PrintFormat {
    public static void main(String[] args) {

        //constants
        System.out.printf("PI : %.2f", Math.PI);
        System.out.printf("\nExponent : %.1f", Math.E);

        String name = "Mourya";
        int age = 33;
        double income = 300000.0;
        char surnameInitial = 'D';
        boolean isSingle = false;
        System.out.printf("\n%s is %d years old. His income is INR %.2f. His Surname start with %c. Is Mourya Single? %b",name, age, income, surnameInitial, isSingle);

        //flags
        double a = 9000.9934526;
        double b = 1000000.494543;
        double c = -112233.543416;
        System.out.printf("\n%+.1f \t%+.1f \t%+.1f", a,b,c);
        System.out.printf("\n%,.2f \t%,.2f \t%,.2f", a,b,c);
        System.out.printf("\n%(.3f \t%(.3f \t%(.3f", a,b,c);
        System.out.printf("\n% .2f \t% .2f \t% .2f", a,b,c);

        //width
        int m = 1;
        int n = 12;
        int o = -123;
        int p = 1234;
        System.out.printf("\n%04d",m);
        System.out.printf("\n%04d",n);
        System.out.printf("\n%04d",o);
        System.out.printf("\n%04d",p);

        //Right Aligned
        System.out.printf("\n%4d",m);
        System.out.printf("\n%4d",n);
        System.out.printf("\n%4d",o);
        System.out.printf("\n%4d",p);

        //Left Aligned
        System.out.printf("\n%-4d",m);
        System.out.printf("\n%-4d",n);
        System.out.printf("\n%-4d",o);
        System.out.printf("\n%-4d",p);
    }
}
