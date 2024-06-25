package practise.leetcode;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        String str = "";
        char[] arr = command.toCharArray();
        int index = 0;
        int last = command.length();
        while (index<last) {
            if (arr[index] == 'G') {
                str = str + "G";
                index = index + 1;
            }
            else if (arr[index] == '(') {
                if (arr[index+1] == ')') {
                    str = str + "o";
                    index = index + 2;
                }
                    else {
                    str = str + "al";
                    index = index + 4;
                }
            }
        }
        return str;
    }
}
