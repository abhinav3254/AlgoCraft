package recursion.strings;

import java.util.HashSet;

public class SubSequence {
    public static void main(String[] args) {
        subsequence("","abc");
        System.out.println();
        System.out.println(subsequenceHashSet("","abc",new HashSet<>()));
    }


    // getting all the subsets of abc i.e. a,b,c,ab,ac,bc,abc
    private static void subsequence(String processed,String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed+" ");
            return;
        }
        char c = unprocessed.charAt(0);
        // taking
        subsequence(processed+c,unprocessed.substring(1));
        // ignoring
        subsequence(processed,unprocessed.substring(1));
    }


    // returning the subsets wrapped inside the hashset
    private static HashSet<String> subsequenceHashSet(String processed, String unprocessed,HashSet<String> set) {
        if (unprocessed.isEmpty()) {
            set.add(processed);
            return set;
        }
        char c = unprocessed.charAt(0);
        // taking
        subsequenceHashSet(processed+c,unprocessed.substring(1),set);
        // ignoring
        subsequenceHashSet(processed,unprocessed.substring(1),set);
        return set;
    }
}
