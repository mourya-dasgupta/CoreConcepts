package array;

/**
 * DRAWBACKS of ARRAY
 * 1. We have to define size beforehand as continuous memory location is being allocated in heap memory for our declaration (new int[10]).
 * 2. Traverse element one by one.
 * 3. Multiple types of elements is a single array is not possible.
 */
public class Array1D {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for(int a : arr)
            System.out.println(a);
    }
}
