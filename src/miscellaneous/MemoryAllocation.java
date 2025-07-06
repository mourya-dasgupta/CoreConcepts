package miscellaneous;

class Calculator {
    int num = 5;

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
public class MemoryAllocation {
    public static void main(String[] args) {
        int data = 10;

        Calculator calc = new Calculator();
        int m = calc.add(4, 5);
        System.out.println(m);
    }
}

/**
 * There are 2 types of Memory STACK and HEAP
 *
 * In Stack all the local variables are being stored. Fixed
 *
 * In Heap all the instances are being stored. The address of the reference variable are being store in stack memory itself.
 * Instance variables are also stored in Heap Memory. Expandable
 *
 *
 * STACK MEMORY for Main (LIFO)
 * calc |   1001 (Linked with Memory address located at Heap Memory)
 * m    |   (creates a stack memory for add method, awaiting return value)
 * data |   10
 *
 * STACK Memory for Add
 * n1   |   4
 * n2   |   5
 *
 * HEAP Memory
 * 1001 (Memory Address)
 * num = 5 (Instance Variable)
 * add()
 *
 * Note : If we create one more object say calc2, changes will be as follows
 * STACK MEMORY for Main (Newly added)
 *  * calc2 |   1005 (Linked with Memory address located at Heap Memory)
 *
 *  HEAP Memory
 *  * 1005 (Memory Address)
 *  * num = 5 (Instance Variable)
 *  add()
 *
 *  Suppose if we execute the below statement
 *  calc.num = 10;
 *
 *  calc.num will return 10 but
 *  calc2.num will return 5 as it is a whole different instance of Calculator
 */