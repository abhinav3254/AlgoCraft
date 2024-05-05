package recursion.gfg;

import java.util.ArrayList;
import java.util.List;

public class WithoutLoop {
    public static void main(String[] args) {
//        printPattern(16,0);
//        System.out.println();
        List<Integer> list = new ArrayList<>();
        System.out.println(printPatternList2(10,0,list));
//        System.out.println(printPatternList(10,0).size());
    }

    // done question :- https://www.geeksforgeeks.org/print-a-pattern-without-using-any-loop/
    private static void printPattern(int n,int count) {
        System.out.print((n - 5 * count)+" ");
        int m = n - 5 * count;
        if (m<=0) return;
        printPattern(n,count+1);
        System.out.print(m+" ");
    }


    // Time Complexity :- O(n^2) and space complexity is O(n)
    private static List<Integer> printPatternList(int n, int count) {
        List<Integer> list = new ArrayList<>();
        int m = n - 5 * count;
        list.add(m);
        if (m <= 0) return list;
        list.addAll(printPatternList(n, count + 1));
        list.add(m);
        return list;
    }


    // finally, reduced the time complexity from 0(n^2) to O(n) and ans accepted
    private static List<Integer> printPatternList2(int n, int count,List<Integer> list) {
        int m = n - 5 * count;
        list.add(m);
        if (m <= 0) return list;
        printPatternList2(n, count + 1,list);
        list.add(m);
        return list;
    }


}
