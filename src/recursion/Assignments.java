package recursion;

import java.util.Arrays;

public class Assignments {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumOfTriangles2(arr,arr.length-1);
    }


    // question 1 solved using recursion
    // link to problem :- https://www.geeksforgeeks.org/sum-triangle-from-array/
    private static void sumOfTriangles2(int[] arr,int end) {
        if (arr.length == 0) return;
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[end];
        for (int i = 0;i<end;i++) {
            temp[i] = arr[i]+arr[i+1];
        }
        sumOfTriangles2(temp,end-1);
    }


    // To solve using iteration is pending... once I will be back I will solve this one
    private static void sumOfTrianglesIteration() {}
}
