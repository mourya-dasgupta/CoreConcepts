package oopsconcept;

/**
 * Inheritance is a mechanism/process where one class acquires the properties (methods and attributes) of another.
 * The class which inherits the properties of other is known as subclass (derived class, child class).
 * The class whose properties are getting inherited is known as superclass (base class, parent class).
 * Why it is required?
 * 	• Code Reusability
 * 	• Extensibility
 * 	• Implementation of Method Overriding
 * 	• Achieving Abstraction
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 *
 * 'super' Keyword :
 * • It is used to differentiate the members of superclass from the members of subclass, if they share a same name.
 * • It is used to invoke the superclass constructor from subclass.
 * 'this' Keyword :
 * • It is used to point at the current object.
 */

class Operators{
    int result;
    public void calculation() {
        System.out.println("Performing Calculation");
    }
}
class ArithmaticOperators extends Operators {
    boolean flag;
    public int addition(int a, int b) {
        result = a + b;
        return result;
    }
    public int subtraction(int a, int b) {
        result = a - b;
        return result;
    }
}

class LogicalOperators extends Operators {
    public int logicalAnd(int a, int b) {
        result = (a>0 && b>0) ? 1 : 0;
        return result;
    }
}
public class InheritanceEg1 {
    public static void main(String[] args) {
        Operators op1 = new Operators();
        op1.calculation();
        System.out.println(op1.result);

        Operators op2 = new ArithmaticOperators();
        op2.calculation();
        //op2.addition(5,7);        Not Possible
        //op2.flag;                 Note Possible

        ArithmaticOperators op3 = new ArithmaticOperators();
        System.out.println(op3.addition(5,6));
        System.out.println(op3.subtraction(8,6));
        System.out.println(op3.flag);

        LogicalOperators op4 = new LogicalOperators();
        System.out.println(op4.logicalAnd(5,6));
    }
}
