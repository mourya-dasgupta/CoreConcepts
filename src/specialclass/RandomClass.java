package specialclass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        //Random Integer number without bound varies from -2B to +2B approx. Includes Origin. Excludes Bound.
        int num;
        num = random.nextInt(1,7);
        System.out.println(num);

        //Random Double number without bound varies from 0 to 1 approx. Includes Origin. Excludes Bound.
        double num1;
        num1 = random.nextDouble(1.4,7.9);
        System.out.println(num1);

        boolean decision;
        decision = random.nextBoolean();
        System.out.println(decision);
    }
}
