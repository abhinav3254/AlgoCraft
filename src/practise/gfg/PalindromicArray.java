package practise.gfg;


// link :- https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&category=Arrays&difficulty=School&sortBy=submissions
public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr = {111 ,222 ,333 ,444, 555};
        System.out.println(palinArray(arr,arr.length));

    }

    public static int palinArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (!plainPal(arr[i])) return 0;
        }
        return 1;
    }

    private static boolean plainPal(int temp) {
        char[] arr = (temp+"").toCharArray();
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            if (arr[start++] != arr[end--]) return false;
        }
        return true;
    }
}
