package recursion.gfg;

import java.util.ArrayList;
import java.util.List;


// question link :- https://www.geeksforgeeks.org/print-all-possible-paths-from-top-left-to-bottom-right-of-a-mxn-matrix/
public class AllPossiblePaths {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6}};
        List<String> list = new ArrayList<>();
        findAllPaths(arr,0,0,"",list);
        System.out.println(list);
    }

    private static void findAllPaths(int[][] arr,int r,int c,String p,List<String> list) {
        if (r == arr.length-1 && c == arr[r].length-1) {
            p = p + arr[r][c];
            list.add(p);
            return;
        }
        if (r<arr.length-1) findAllPaths(arr, r+1, c, p+arr[r][c], list);
        if (c<arr[r].length-1) findAllPaths(arr, r, c+1, p+arr[r][c], list);
    }
}
