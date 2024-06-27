package practise.leetcode;

public class Leet9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String one = x+"";
        StringBuilder ans = new StringBuilder();
        for(int i=one.length()-1;i >=0 ;i--) {
            ans.append(one.charAt(i));
        }
        return one.contentEquals(ans);
    }
}
