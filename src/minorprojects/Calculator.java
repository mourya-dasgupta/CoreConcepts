package minorprojects;

import java.util.Scanner;

class Calculate {
    public int add (int n1, int n2){
        return n1 + n2;
    }
    public int subtract (int n1, int n2) {
        return n1>n2 ? n1-n2 : n2 - n1;
    }
    public int multiply (int n1, int n2) {
        return n1 * n2;
    }
    public int divide (int n1, int n2) {
        return n1>n2 ? n1/n2 : n2/n1;
    }
    public int mod (int n1, int n2) {
        return n1>n2 ? n1%n2 : n2%n1;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Please enter a arithmetic operator : ");
        char operator = sc.next().charAt(0);

        int result;
        Calculate calc = new Calculate();

        switch(operator) {
            case '+' : result = calc.add(a, b);
                        break;
            case '-' : result = calc.subtract(a, b);
                        break;
            case '*' : result = calc.multiply(a, b);
                        break;
            case '/' : result = calc.divide(a, b);
                        break;
            case '%' : result = calc.mod(a, b);
                        break;
            default : result = 0;
        }
        System.out.println("Result : " + result);
    }
}
