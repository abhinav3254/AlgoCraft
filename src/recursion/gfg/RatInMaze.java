package recursion.gfg;

import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        findPath(arr, 0,0,"");
    }

    public static void findPath(int[][] arr, int r,int c,String p) {
        if (r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(p);
            return;
        }
        if (arr[r][c]!=0) {
            arr[r][c] = 0;
            if (r<arr.length-1) findPath(arr,r+1,c,p+"D");
            if (c<arr[0].length-1) findPath(arr,r,c+1,"R");
            if (c>0) findPath(arr,r,c-1,p+"L");
            if (r>0) findPath(arr,r-1,c,p+"U");
            arr[r][c] = 1;
        }
    }
}
