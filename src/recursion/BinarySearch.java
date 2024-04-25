package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(binarySearch(arr,40));
        System.out.println(binarySearchRecursion(arr,40,0,arr.length-1));
    }


    // binary search tree implementation using iteration
    private static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = 10 -1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid]> target) {
                // shift end to left side
                end = mid - 1;
            } else {
                // shift start to mid + 1
                start = mid + 1;
            }
        }
        return -1;
    }

    // binary search tree using recursion
    private static int binarySearchRecursion(int[] arr,int target,int start,int end) {
        if (start>end) return -1;

        int mid = (start+end)/2;
        if (arr[mid] == target) return mid;
        if (target < arr[mid]) end = mid-1;
        else start = mid + 1;
        return binarySearchRecursion(arr,target,start,end);
    }

}
