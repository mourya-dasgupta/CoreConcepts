package array;

/**
 * A multi directional array where number of columns differ from one another is called jagged array.
 */
public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];

        //Hard coded Values
//        arr[0] = new int[] {1, 2};
//        arr[1] = new int[] {3, 4, 5};
//        arr[2] = new int[] {6, 7, 8, 9};

        //Random value using Math.random
        arr[0] = new int[5];
        arr[1] = new int[7];
        arr[2] = new int[6];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        //Printing the array
        for(int a[] : arr) {
            for(int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
