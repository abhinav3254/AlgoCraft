package practise.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet2000 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("xyxzxe",'z'));
    }

    public static String reversePrefix(String word, char ch) {
        if (word.contains(ch+"")) {
            int ARRAY_SIZE = word.length();
            StringBuilder ans = new StringBuilder();
            List<Character> characters = new ArrayList<>();
            char[] arr = word.toCharArray();

            for (int i = 0; i < ARRAY_SIZE; i++) {
                characters.add(arr[i]);
                word = word.substring(1);
                if (arr[i] == ch) {
                    break;
                }
            }
            for (int i = characters.size()-1; i >= 0; i--) {
                ans.append(arr[i]);
            }
            return ans.append(word).toString();
        } else return word;
    }

}
