package practise.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Leet1773 {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("ii","iiiiiii","ii"),
                Arrays.asList("iiiiiii","iiiiiii","ii"),
                Arrays.asList("ii","iiiiiii","iiiiiii")
        );
        System.out.println(countMatches(items,"color","ii"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            if (Objects.equals(ruleKey, "type")) {
                // look for 0th index
                if (item.get(0).equals(ruleValue)) count = count + 1;
            } else if (Objects.equals(ruleKey, "color")) {
                // look for 1st index
                if (item.get(1).equals(ruleValue)) count = count + 1;
            } else {
                // look for last index
                if (item.get(2).equals(ruleValue)) count = count + 1;
            }
        }

        return count;
    }
}
