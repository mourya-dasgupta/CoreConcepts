package operators;

public class MathClass {
    public static void main(String[] args) {

        //constants
        System.out.println("PI : " + Math.PI);
        System.out.println("Euler's Value : " + Math.E);   //Exponential Constant

        //methods
        System.out.println("Random number : " + Math.random() *100);    //Math.random always gives a value between 0 and 1
        System.out.println("Rounding Off : " + Math.round(2.76f));
        System.out.println("Ceil Value : " + Math.ceil(45.6789));
        System.out.println("Floor Value : " + Math.floor(3.56));
        System.out.println("Max Value : " + Math.max(4,89));
        System.out.println("Min Value : " + Math.min(-6, -99));
        System.out.println("Power : " + Math.pow(3, 3));
        System.out.println("Absolute Value : " + Math.abs(-5));
        System.out.println("Square Root : " + Math.sqrt(16));
    }
}
