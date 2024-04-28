package recursion.strings;

public class SubSequence {
    public static void main(String[] args) {
        subsequence("","abc");
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
}
