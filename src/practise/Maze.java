package practise;

public class Maze {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        findRoute(arr,0,0,"");
    }

    private static void findRoute(boolean[][] arr,int r,int c,String path) {
        if (arr[r][c]) {
            // considering the matrix to be square matrix
            if (r == arr.length-1 && c == arr[0].length-1) {
                System.out.println(path);
                return;
            }
            arr[r][c] = false;
            // going down
            if (r<arr.length-1) findRoute(arr,r+1,c,path+"D");
            // go left
            if (c>0) findRoute(arr,r,c-1,path+"L");
            // going right
            if (c<arr[0].length-1) findRoute(arr,r,c+1,path+"R");
            // go to up
            if (r>0) findRoute(arr,r-1,c,path+"U");
            arr[r][c] = true;
        }
    }
}
