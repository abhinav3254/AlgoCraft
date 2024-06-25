package practise.leetcode;

public class Leet2114 {
    public static void main(String[] args) {

        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(arr));

    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String str = sentences[i];
            String[] temp = str.split(" ");
            if (temp.length>max) max = temp.length;
        }
        return max;
    }
}
