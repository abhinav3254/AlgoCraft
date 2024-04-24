package recursion;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        printNumbers(1);
        System.out.println(findFibonacciNumber(4));
        System.out.println(findFibonacciNumber(4));

        HashMap<Integer,Long> map = new HashMap<>();
        System.out.println(findFibonacciUsingDynamicProgramming(4,map));

    }

    // space complexity of this method is O(n)
    // basically this method for just understanding the recursion printing the number till 4 included
    private static void printNumbers(int n) {
        // Base condition for this recursion call
        if (n == 5) return;
        // printing the number first then calling another function
        System.out.print(n+" ");
        // recursive call
        // each method will take separate space in stack
        printNumbers(n+1);
    }


    // Find the fibonacci number at that index
    private static int findFibonacciNumber(int index) {
        // base condition
        if (index<3) return index;
        return findFibonacciNumber(index-1)+ findFibonacciNumber(index-2);
    }

    // find fibonacci number at index using iteration
    private static int findFibonacciNumberIteration(int index) {
        int n = 0;
        int m = 1;
        for (int i = 2;i<index;i++) {
            int sum = n+m;
            n = m;
            m = sum;
        }
        return m;
    }


    // find fibonacci using dynamic programming for optimized solution
    private static long findFibonacciUsingDynamicProgramming(int index,HashMap<Integer,Long> map) {
        if (map.containsKey(index)) return map.get(index);
        if (index < 3) return index;
        map.put(index,findFibonacciUsingDynamicProgramming(index-1,map)+findFibonacciUsingDynamicProgramming(index-2,map));
        return map.get(index);
    }
}
