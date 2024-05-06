package recursion.questions;

public class MeanArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findArrayMean(arr, arr.length));
    }

    private static double findArrayMean(int[] arr,int n) {
        if (n == 1) return arr[n-1];
        return (arr[n-1] + findArrayMean(arr,n-1)*(n-1))/n;
    }
}
