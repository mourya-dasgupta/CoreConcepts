package miscellaneous;

/**
 *There are two types of Variable scopes : LOCAL and CLASS
 * LOCAL will always get priority over CLASS when we have same name of the variables.
 */
public class VariableScope {
    static int x = 3;   //CLASS scope
    public static void main(String[] args) {
        int x = 1;  //LOCAL to main()
        System.out.println("Value of X in main() : " + x);
        doSomething();
    }

    static void doSomething() {
        int x = 2; //LOCAL to doSomething()
        System.out.println("Value of X in doSomething() : " + x);
    }
}
