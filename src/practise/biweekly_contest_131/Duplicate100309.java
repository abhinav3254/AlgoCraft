package practise.biweekly_contest_131;

import java.util.ArrayList;
import java.util.List;



// leet code :- 100309. Find the XOR of Numbers Which Appear Twice
public class Duplicate100309 {
    public static void main(String[] args) {
        int[] arr = {10,18,7,10,18};
        System.out.println(duplicateNumbersXOR(arr));
    }
    public static int duplicateNumbersXOR(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) list.add(arr[i]);
            }
        }


        // note we have to XOR all the numbers which are repeated
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum ^ list.get(i);
        }
        return sum;
    }
}
