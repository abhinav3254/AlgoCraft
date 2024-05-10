package maths;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i+" is odd "+isOdd(i));
        }
    }

    private static boolean isOdd(int n) {
        return (n&1) == 1;
    }
}
