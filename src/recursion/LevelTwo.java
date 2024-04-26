package recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This will contain all the Level Two Questions
public class LevelTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(checkArrayIsSortedOrNotIteration(arr));
        System.out.println(checkIsArraySorted(arr,0));
        System.out.println(sorted(arr,0));
        System.out.println("linear search :- "+linearSearch(arr,14,0));
        System.out.println("linear search index :- "+linearSearchFindIndex(arr,4,0));

        int[] newArray = {1,2,3,4,5,4,6};
        List<Integer> list = new ArrayList<>();
        System.out.println(findElementsAtMultipleIndex(newArray,0,list,4));
        System.out.println(findElementsAtMultipleIndex2(newArray,0,4));
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


    // linear search using recursion
    private static boolean linearSearch(int[] arr,int target,int index) {
        if (arr.length == index) return false;
        if (arr[index] == target) return true;
        return linearSearch(arr,target,index+1);
    }


    // this method will return the index number at which element found if not found then return -1
    private static int linearSearchFindIndex(int[] arr,int target,int index) {
        if (arr.length == index) return -1;
        if (arr[index] == target) return index;
        return linearSearchFindIndex(arr,target,index+1);
    }


    // if more than one target is there then we return list of integers which have their index
    private static List<Integer> findElementsAtMultipleIndex(int[] arr,int index,List<Integer> list,int target) {
        if (arr.length == index) return list;
        if (arr[index] == target) list.add(index);
        return findElementsAtMultipleIndex(arr, index+1, list, target);
    }


    // In this approach we are creating a new list in each call....
    private static List<Integer> findElementsAtMultipleIndex2(int[] arr,int index,int target) {
        List<Integer> list = new ArrayList<>();
        if (arr.length == index) return list;
        if (arr[index] == target) list.add(index);
        List<Integer> ansFromBelowCalls = findElementsAtMultipleIndex2(arr,index+1,target);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
