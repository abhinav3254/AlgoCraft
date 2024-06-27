package practise.leetcode;

import java.util.HashMap;

public class Leet1528 {
    public static void main(String[] args) {

    }


    // given All values of indices are unique.
    public static String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], arr[i]);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            ans.append(map.get(i));
        }
        return ans.toString();
    }
}
