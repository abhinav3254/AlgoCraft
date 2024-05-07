package recursion.gfg;


// question :- https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,-13,4,5};
        System.out.println(findMax(arr,arr.length-1));
        System.out.println(findMin(arr,arr.length-1));
    }

    private static int findMax(int[] arr,int n) {
        if (n == 0) {
            return arr[n];
        }
        return Math.max(arr[n],findMax(arr,n-1));
    }

    private static int findMin(int[] arr,int n) {
        if (n == 0) return arr[n];
        return Math.min(arr[n],findMin(arr,n-1));
    }
}
