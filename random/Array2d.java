package random;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[][] intArray1;
        intArray1 = new int[3][5];
        for(int[] arr: intArray1) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(intArray1.length);
    }
}
