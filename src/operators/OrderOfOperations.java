package operators;

public class OrderOfOperations {
    public static void main(String[] args) {

        /**
         * Order Of Operation
         * P-E-M-D-A-S
         * Parenthesis - Exponential- Multiply - Divide - Addition - Subtraction
         * Note: Exponent is done in Java via Math.pow operator and not using'^'
         */
        double result = 3 + 5 * 8 / Math.pow((4-2),(5 % 3));
        System.out.println(result);
    }
}
