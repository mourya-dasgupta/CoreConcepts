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

        //Shift Operators
        System.out.println("~~Shift Operators~~");

        //InstanceOf Operator
        System.out.println("~~Instanceof Operator~~");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc instanceof Scanner);
    }
}
