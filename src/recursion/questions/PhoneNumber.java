package recursion.questions;


import java.util.List;

// Leetcode problem number :- 17
public class PhoneNumber {
    public static void main(String[] args) {
//        pad("89","");
        phoneCombination("","12");
    }

    private static void pad(String up,String p) {
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }
        int digit = up.charAt(0) - '0'; //  getting the number in Integer type
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            pad(up.substring(1),p+ch);
        }
    }

    private static void phoneCombination(String p,String up) {
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) (i + 'a');
            phoneCombination(p+ch,up.substring(1));
        }
    }

}
