package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(binarySearch(arr,10,50));
    }


    // binary search tree implementation using iteration
    private static int binarySearch(int[] arr,int size,int key) {
        int start = 0;
        int end = size-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (arr[mid] == key) return mid;
            else if (arr[mid]>key) {
                // shift end to left side
                end = mid - 1;
            } else {
                // shift start to mid + 1
                start = mid + 1;
            }
        }
        return -1;
    }
}
