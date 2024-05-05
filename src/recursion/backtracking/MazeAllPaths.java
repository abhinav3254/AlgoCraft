package recursion.backtracking;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPathsMazeBacktracking(arr,0,0,"");
    }

    // here we can't use all the directions because as you can debug it will stuck in between of DUDU.....
    // and give stack overflow error because since first it will go down and r>0, so it will go to up and again r<0
    // again down now again r>0 so again up...., and it will go so on......
    private static void allPathsMaze(boolean[][] arr,int r,int c,String p) {
        if (r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(p);
            return;
        }
        if (r<arr.length-1) allPathsMaze(arr, r+1, c, p+'D');
        if (c<arr[0].length-1) allPathsMaze(arr, r, c+1, p+'R');
//        if (c>0) allPathsMaze(arr, r, c-1, p+'L');
//        if (r>0) allPathsMaze(arr, r-1, c, p+'U');
    }


    // This is backtracking...
    // to resolve this issue, we are going to use flag or mark the visited cells as visited
    private static void allPathsMazeBacktracking(boolean[][] arr,int r,int c,String p) {
        if (r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(p);
            return;
        }
        if (arr[r][c]) {
            // when we get entered into any index, we will make the changes so that infinite loop will not form
            arr[r][c] = false;
            if (r<arr.length-1) allPathsMazeBacktracking(arr, r+1, c, p+'D');
            if (c<arr[0].length-1) allPathsMazeBacktracking(arr, r, c+1, p+'R');
            if (c>0) allPathsMazeBacktracking(arr, r, c-1, p+'L');
            if (r>0) allPathsMazeBacktracking(arr, r-1, c, p+'U');
            // now while coming out we are setting up the changes that we did so that It will not disturb another function
            arr[r][c] = true;
        } else return;

    }

}
