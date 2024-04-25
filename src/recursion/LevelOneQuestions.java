package recursion;


// This class contains all the easy level questions
public class LevelOneQuestions {
    public static void main(String[] args) {
        printNtoOne(5);
        System.out.println();
        print1ToN(5);
        System.out.println();
        System.out.println(factorial(5));
    }

    // print numbers from n......1
    private static void printNtoOne(int n) {
        if (n == 0) return;
        System.out.print(n+" ");
        printNtoOne(--n);
    }

    // print numbers from 1.....n
    private static void print1ToN(int n) {
        if (n == 0) return;
        print1ToN(n-1);
        System.out.print(n+" ");
    }


    // factorial question... using recursion
    private static int factorial(int n) {
        if (n == 1) return 1;
        return n*factorial(n-1);
    }
}
