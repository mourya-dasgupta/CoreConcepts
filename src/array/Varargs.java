package array;

/**
 * Varargs allows a method to accept a varying number of arguments. It makes methods more flexible,
 * No need for Overloaded methods. Java will pack the arguments into an array.
 * "..." -> It is called ellipsis
 */
public class Varargs {
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4));
        System.out.println(average(765,89));
        System.out.println(average(1,2,3,4,5,6,7,8,9,10));
    }
    static double average(double... nums) {
        double sum = 0;
        for(double i : nums)
            sum += i;
        return sum/nums.length;
    }
}
