package recursion.gfg;


// question link :- https://www.geeksforgeeks.org/recursive-function-check-string-palindrome/
public class StringPalindrome {
    public static void main(String[] args) {
        String string = "aabbaa";
        System.out.println(findPalindrome(string,0,string.length()-1));
    }

    private static boolean findPalindrome(String string,int start,int end) {
        if (start>=end) return true;
        return (string.charAt(start) == string.charAt(end)) && findPalindrome(string,start+1,end-1);
    }
}
