package recursion.backtracking;

import java.util.Arrays;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeWithObstaclesReverse(arr,0,0,"");
    }

    private static void mazeWithObstacles(boolean[][] arr,int r,int c,String p) {
        if (!arr[r-1][c-1]) return;
        if (r==1 && c == 1) {
            System.out.println(p);
        }
        if (r>1) mazeWithObstacles(arr,r-1,c,p+'D');
        if (c>1) mazeWithObstacles(arr,r,c-1,p+'R');
    }


    // going from 0 to n
    private static void mazeWithObstaclesReverse(boolean[][] arr,int r,int c,String p) {
        if (!arr[r][c]) return;
        if (r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(p);
            return;
        }
        if (r<arr.length-1) mazeWithObstaclesReverse(arr,r+1,c,p+"D");
        if (c<arr[0].length-1) mazeWithObstaclesReverse(arr,r,c+1,p+"R");
    }
}
