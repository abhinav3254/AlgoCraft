package recursion.gfg;

public class ReverseFibonacci {
    public static void main(String[] args) {
        reverseFindFibonacci(10,0,1);
    }

    // printing fibonacci number in reverse order
    private static void reverseFindFibonacci(int n,int a,int b) {
        if (n>0) {
            reverseFindFibonacci(n-1,b,a+b);
            System.out.println(a);
        }
    }
}
