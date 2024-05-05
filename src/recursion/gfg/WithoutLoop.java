package recursion.gfg;

public class WithoutLoop {
    public static void main(String[] args) {
        printPattern(16,0);
    }

    // done question :- https://www.geeksforgeeks.org/print-a-pattern-without-using-any-loop/
    private static void printPattern(int n,int count) {
        System.out.print((n - 5 * count)+" ");
        int m = n - 5 * count;
        if (m<=0) return;
        printPattern(n,count+1);
        System.out.print(m+" ");
    }
}
