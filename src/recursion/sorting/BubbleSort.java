package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        bubbleSortIteration(arr);
        bubbleSortRecursion(arr,0,0);
    }

    // Bubble sort using iteration
    private static void bubbleSortIteration (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    // swap the numbers
                    int m = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = m;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Bubble sort using recursion
    private static void bubbleSortRecursion (int[] arr,int r, int c) {
        if (r == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (c<arr.length-1) {
            if (arr[c]>arr[c+1]) {
                int m = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = m;
            }
            bubbleSortRecursion(arr, r, c+1);
        } else {
            bubbleSortRecursion(arr, r+1, 0);
        }
    }
}
