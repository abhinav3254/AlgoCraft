package practise.leetcode;

public class Leet1816 {
    public static void main(String[] args) {

    }

    public static String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < k; i++) {
            ans.append(words[i]).append(" ");
        }
        return ans.toString().trim();
    }

}
