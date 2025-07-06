package conditionalstatement;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        int max = a>b && a>c ? a : b>c ? b : c;
        System.out.println("Max : " + max);
    }
}
