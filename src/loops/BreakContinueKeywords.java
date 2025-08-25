package loops;

public class BreakContinueKeywords {
    public static void main(String[] args) {

        //break : break out of a loop (STOP)
        for(int i = 1; i <= 10; i++) {
            if(i==7)
                break;
            System.out.println(i);
        }

        System.out.println("~~~");
        //continue : skip current iteration of a loop (SKIP)
        for(int i = 1; i <= 10; i++) {
            if(i==7)
                continue;
            System.out.println(i);
        }
    }
}
