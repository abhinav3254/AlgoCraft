package recursion.permutation;


// permutation is basically re-arranging the order
// but in subset and sub-sequence we take or ignore...
public class Main {
    public static void main(String[] args) {
//        System.out.print("[ ");
//        permutation("","abc");
//        System.out.print("]");

        permutationSecond("","abc");
    }

    private static void permutation(String p,String up) {
        if (up.isEmpty()) {
            System.out.print(p+", ");
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i < p.length()+1; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutation(f+ch+s,up.substring(1));
        }
    }

    private static void permutationSecond(String p,String up) {
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String start = p.substring(0,i);
            String end = p.substring(i);
            permutationSecond(start+ch+end,up.substring(1));
        }
    }
}
