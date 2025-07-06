package classesandobjects;

class Calculator{
    int sum = 0;
    public int add(int n1, int n2) {
        sum = n1 + n2;
        return sum;
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator calc = new Calculator();
        System.out.println("Sum : " + calc.add(num1, num2));
    }
}
