package operators;

import java.util.Scanner;

public class TypesOfOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;

        // Arithmatic Operators
        System.out.println("~~Arithmatic Operators~~");
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulous : " + (a % b));

        //Relational Operator
        System.out.println("~~Relational Operators~~");
        System.out.println("Greater Than : " + (a > b));
        System.out.println("Greater Than Equals to : " + (a >= b));
        System.out.println("Less Than : " + (a < b));
        System.out.println("Less Than Equals to : " + (a <= b));
        System.out.println("Equals to : " + (a == b));
        System.out.println("Not Equals to : " + (a != b));

        //Unary Operators   [One Operand Only]
        System.out.println("~~Unary Operators~~");
        System.out.println("Positive Value : " + (+b));
        System.out.println("Negates a Value : " + (-b));
        System.out.println("Pre-Increment : " + (++a));
        System.out.println("Post-Increment : " + (a++));
        System.out.println("Pre-Decrement : " + (--a));
        System.out.println("Post-Decrement : " + (a--));

        //Assignment Operators
        System.out.println("~~Assignment Operators~~");
        a = 20;
        b = 4;
        System.out.println("Add and assign : " + (a += 10));
        System.out.println("Subtract and assign : " + (a -= 10));
        System.out.println("Multiply and assign : " + (a *= 10));
        System.out.println("Divide and assign : " + (a /= 10));
        System.out.println("Modulo and assign : " + (a %= 10));

        //Logcal Operators
        System.out.println("~~Logical Operators~~");
        a = 20;
        b = 4;
        System.out.println("Logical AND : " + ((a > b) && (a % b == 0)));
        System.out.println("Logocal OR : " + ((a > b) || (a % b ==0)));
        System.out.println("Logical NOT : " + !(a < b));

        //Ternary Operator
        System.out.println("~~Ternary Operator~~");
        System.out.println((a>b)? "A is greater than B" : "B is greater than A");

        //Bitwise Operators
        System.out.println("~~Bitwise Operators~~");
        int x = 2;
        int y = 3;
        //AND (& : When both the bits are 1, then only it returns 1, else 0)
        System.out.println("AND Operation");
        System.out.println("5 & 3 = " + (a & b));
        System.out.println("Binary : " + Integer.toBinaryString(a & b));
        //OR (| : When any one of the bits are 1, it returns 1,e else 0)
        System.out.println("OR Operation");
        System.out.println("5 | 3 = " + (a | b));
        System.out.println("Binary : " + Integer.toBinaryString(a | b));
        //XOR (^ : When both the bits are not same, then only it returns 1, else 0)
        System.out.println("XOR Operation");
        System.out.println("5 ^ 3 = " + (a ^ b));
        System.out.println("Binary : " + Integer.toBinaryString(a ^ b));
        //Complement or NOT (~ : Returns inverse of a bit)
        System.out.println("NOT Operation");
        System.out.println("~5 = " + (~a));
        System.out.println("Binary : " + Integer.toBinaryString(~a));

        //Shift Operators
        System.out.println("~~Shift Operators~~");
        //Left Shift (<< : Shifts one bit to the left side from right side and adds a 0 at the end. eg: 0101 << 1 : 1010)
        System.out.println("Left Shift Operation");
        System.out.println("5 << 1 = " + (a << 1));
        System.out.println("Binary : " + Integer.toBinaryString(a << 1));
        //Signed Right Shift >>
        System.out.println("Signed Right Shift Operation");
        System.out.println("5 >> 1 = " + (a >> 1));
        System.out.println("Binary : " + Integer.toBinaryString(a >> 1));
        //Unsigned Right Shift >>>
        System.out.println("Unsigned Right Shift Operation");
        System.out.println("5 >>> 1 = " + (a >>> 1));
        System.out.println("Binary : " + Integer.toBinaryString(a >>> 1));

        //InstanceOf Operator
        System.out.println("~~Instanceof Operator~~");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc instanceof Scanner);
    }
}

/**
 * Bitwise Operators
 *  A   B   A&B     A|B     A^B     ~A
 *  0   0    0       0       0       1
 *  0   1    0       1       1       1
 *  1   0    0       1       1       0
 *  1   1    1       1       0       0
 */