package recursion;


// This class contains all the easy level questions
public class LevelOneQuestions {
    public static void main(String[] args) {
        printNtoOne(5);
        System.out.println();
        print1ToN(5);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sumOfNTo1(5));

        System.out.println("sum of numbers are :- "+sumOfNumbers(12345));

        System.out.println("number reverse is :- "+reverseNumber(12345,0));

        System.out.println("reverse using iteration :- "+reverseNumberIteration(12345));
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


    // sum of number from n to 1
    private static int sumOfNTo1(int n) {
        if (n == 1) return 1;
        return n+ sumOfNTo1(n-1);
    }

    // method from sum of numbers 1234 = 1 + 2 + 3 + 4 = 10
    private static int sumOfNumbers(int n) {
        if (n<10) return n;
        return n%10 + sumOfNumbers(n/10);
    }

    // method to reverse a number
    private static int reverseNumber (int n,int sum) {
        if (n <10) return (sum*10) + n;
        sum = sum * 10 + (n%10);
        return reverseNumber(n/10,sum);
    }

    // reverse number using iteration...
    private static int reverseNumberIteration(int n) {
        if (n < 10) return n;
        int m = 0;
        while (n > 0) {
            m = m*10+(n%10);
            n /= 10;
        }
        return m;
    }
}
