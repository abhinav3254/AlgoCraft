package recursion.gfg;

public class Maze {
    public static void main(String[] args) {
        boolean[][] arr = {
        {true,true,true},
        {true,true,true},
        {true,true,true},
        };
        findPath(arr,0,0,"");
    }

    private static void findPath(boolean[][] arr,int r,int c,String p) {
        if(r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(p);
            return;
        }
        if (arr[r][c]) {
            arr[r][c] = false;
            if (r<arr.length-1) findPath(arr, r+1, c, p+'D');
            if (c<arr[0].length-1) findPath(arr,r,c+1,p+'R');
            if (r>0) findPath(arr,r-1,c,p+'U');
            if (c>0) findPath(arr, r, c-1, p+'L');
            arr[r][c] = true;
        }
    }
}
