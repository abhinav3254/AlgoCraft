package recursion.strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeAFromStringIteration("baccad"));
        System.out.println(removeAFromStringRecursion("baccad","",0));
        System.out.println(removeAFromStringRecursionInBody("dadabaccad",0));
        System.out.println(removeAFromStringRecursionUsingSubstring("abhinav",""));

        System.out.println("remove apple :- "+skipApple("abcdappleefa",""));
    }


    // remove letter a from the string using iteration
    private static StringBuilder removeAFromStringIteration(String str) {
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'A' && str.charAt(i) != 'a') {
                data.append(str.charAt(i));
            }
        }
        return data;
    }

    // remove letter a from string using recursion
    private static String removeAFromStringRecursion(String str,String newString,int index) {
        if (index == str.length()) return newString;
        if (str.charAt(index) != 'A' && str.charAt(index) != 'a') newString = newString + str.charAt(index);
        return removeAFromStringRecursion(str,newString,index+1);
    }


    // creating String Builder in every method call and then returning whole string builder in the end....
    private static StringBuilder removeAFromStringRecursionInBody(String str,int index) {
        StringBuilder stringBuilder = new StringBuilder();
        if (index == str.length()) return stringBuilder;
        if (str.charAt(index) != 'A' && str.charAt(index) != 'a') stringBuilder.append(str.charAt(index));
        stringBuilder.append(removeAFromStringRecursionInBody(str,index+1));
        return stringBuilder;
    }


    // remove letter a from the string using substring method...
    private static String removeAFromStringRecursionUsingSubstring(String str,String newString) {
        if (str.isEmpty() || str.isBlank()) return newString;
        if (str.charAt(0) != 'A' && str.charAt(0) != 'a') newString = newString + str.charAt(0);
        return removeAFromStringRecursionUsingSubstring(str.substring(1),newString);
    }


    // skipping apple from the string
    private static String skipApple(String str,String newString) {
        if (str.isBlank() || str.isEmpty()) return newString;
        // the current index where we are starting from there we are checking everytime if from the current index does the
        // string have apple in it... if yes then remove that string
        if (str.startsWith("apple")) {
            return skipApple(str.substring(5),newString);
        } else {
            newString = newString+str.charAt(0);
            return skipApple(str.substring(1),newString);
        }
    }
}
