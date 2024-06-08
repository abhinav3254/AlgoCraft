package practise.biweekly_contest_132;

import java.util.List;


// 100324
public class ClearDigits {
    public static void main(String[] args) {
        System.out.println(clearDigits("cb345"));
    }

    private static String clearDigits(String string) {
        StringBuilder s = new StringBuilder(string);

        while (containsNumber(s.toString()) && containsNonNumber(s.toString())) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    if (i == 0) {
                        s.delete(0, 2);
                        break;
                    } else {
                        s.delete(i - 1, i + 1);
                        break;
                    }
                }
            }
        }
        return s.toString();
    }


    public static boolean containsNumber(String string) {
        for (char ch : string.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNonNumber(String string) {
        for (char ch : string.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }


}
