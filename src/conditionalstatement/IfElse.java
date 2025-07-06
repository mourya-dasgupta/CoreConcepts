package conditionalstatement;

public class IfElse {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 5;

        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}
