package practise.biweekly_contest_131;

import java.util.*;


// leet code: - 100303 Find Occurrences of an Element in an Array
public class Occurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] queries = {10};
        int x = 5;
        System.out.println(Arrays.toString(occurrencesOfElement(arr,queries,x)));
    }

    public static int[] occurrencesOfElement(int[] arr, int[] queries, int x) {
        int[] temp = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int k = findElement(arr,x,queries[i]);
            temp[i] = k;
        }

        return temp;
    }

    private static int findElement(int[] arr,int key,int times) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int check = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                map.put(check,i);
                check++;
            }
        }

        if (Objects.isNull(map.get(times))) return -1;
        else return map.get(times);
    }


    // optimized solution....
    public int[] occurrencesOfElementOptimized(int[] arr, int[] queries, int x) {
        // Preprocess the array to find all occurrences of x
        List<Integer> occurrences = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                occurrences.add(i);
            }
        }

        // Prepare the result array
        int[] result = new int[queries.length];

        // Answer each query using the preprocessed data
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i];
            if (k > occurrences.size()) {
                result[i] = -1;
            } else {
                result[i] = occurrences.get(k - 1);
            }
        }

        return result;
    }
}
