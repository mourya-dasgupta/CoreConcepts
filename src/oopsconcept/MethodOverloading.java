package oopsconcept;

/**
 * Same method name but different method signature
 * Either number of arguments are different or type of arguments are different
 */
class Sum {
//    public int add(int n1, int n2) {
//        return n1 + n2;
//    }
    public double add(double n1, double n2) {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double d = 3.456;
        Sum obj = new Sum();

        System.out.println(obj.add(a,b));
        System.out.println(obj.add(2.0,7.0));
        System.out.println(obj.add(a,b,c));
        System.out.println(obj.add(d, c));
    }
}
