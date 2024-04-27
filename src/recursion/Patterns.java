package recursion;

public class Patterns {
    public static void main(String[] args) {
        pattern1Iteration(5);
        pattern1Recursion(5,0);
    }


    /**
     * *****
     * ****
     * ***
     * **
     * *
     */
    private static void pattern1Iteration(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // For two loops in above case we took here two variables
    private static void pattern1Recursion(int r,int c) {
        if (r == 0 && c == 0) return;
        if(r>c) {
            System.out.print("* ");
            pattern1Recursion(r,c+1);
        }
        else {
            System.out.println();
            pattern1Recursion(r-1,0);
        }
    }
}
