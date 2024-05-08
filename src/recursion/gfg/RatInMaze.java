package recursion.gfg;

import java.util.ArrayList;


// gfg question :- https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
public class RatInMaze {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
//        int[][] arr = {{1, 0},
//                {1, 0}};
        ArrayList<String> list = new ArrayList<>();
        findPathHelper(arr, 0,0,"",list);
        System.out.println(list);
    }

    public static void findPathHelper(int[][] arr, int r, int c, String p,ArrayList<String> list) {
        if (arr[r][c]==1) {
            if (r == arr.length-1 && c == arr[0].length-1) {
                list.add(p);
                return;
            }
            arr[r][c] = 0;
            // go to right
            if (c< arr[0].length-1) findPathHelper(arr, r, c+1, p+'R',list);
            // go to down
            if (r< arr.length-1) findPathHelper(arr, r+1, c, p+'D',list);
            // go to left
            if (c>0) findPathHelper(arr, r, c-1, p+'L',list);
            // go to up
            if (r>0) findPathHelper(arr,r-1,c,p+'U',list);
            arr[r][c] = 1;
        } else return;
    }
}
