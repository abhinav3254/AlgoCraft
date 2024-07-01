package practise.gfg.arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
//        System.out.println(Arrays.toString(reverseArrayOne(arr,arr.length)));
        recursionHelper(arr,arr.length);
    }

    private static int[] reverseArrayOne(int[] arr,int n) {
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[n-1-i] = arr[i];
        }
        return temp;
    }

    private static void recursionHelper(int[] arr,int n) {
        System.out.println(Arrays.toString(reverseArrayRecursion(arr,n,new int[n],0)));
    }


    private static int[] reverseArrayRecursion(int[] arr,int n,int[] temp,int k) {
        if ( k == n) return temp;
        temp[k] = arr[n-1-k];
        return reverseArrayRecursion(arr,n,temp,++k);
    }
}
