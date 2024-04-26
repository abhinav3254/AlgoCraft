package recursion;


// This will contain all the Level Two Questions
public class LevelTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(checkArrayIsSortedOrNotIteration(arr));
        System.out.println(checkIsArraySorted(arr,0));
        System.out.println(sorted(arr,0));
    }


    // iterative way of checking whether array is sorted or not...
    private static boolean checkArrayIsSortedOrNotIteration(int[] arr) {
        int length = arr.length-1;
        for (int i = 0; i < length; i++) {
            if (arr[i]>arr[i+1]) return false;
        }
        return true;
    }


    // see if our index reached to last means everything is sorted because of which it reached last index....
    // recursive approach of finding whether the array is sorted or not
    private static boolean checkIsArraySorted(int[] arr,int index) {
        if (index >= arr.length-1) return true;
        if (index < arr.length-1 && arr[index]<arr[index+1]) {
            return checkIsArraySorted(arr, ++index);
        }
        return false;
    }


    // another simple and optimized approach for recursion way of checking whether the array is sorted or not...
    private static boolean sorted(int[] arr,int index) {
        if (arr.length-1 == index) return true;
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
