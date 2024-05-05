package recursion.backtracking;

public class Maze {

    public static void main(String[] args) {
        maze(3,3,"");
        System.out.println(count(3,3));
    }


    // counting the number of paths from 3,3 to 1,1
    private static int count(int r,int c) {
        if (r == 1 || c == 1) return 1;
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }

    /**
     *
     * [ start, # , #  ]
     * [    # , # , #  ]
     * [    # , # , end]
     *
     * @param r represents row
     * @param c represents column
     */
    private static void maze(int r,int c,String p) {
        if (c == 1 && r == 1) {
            System.out.print(p+" ");
            return;
        }
        // do right
        if (c>1) maze(r,c-1,p+'R');
        // go down
        if (r>1) maze(r-1,c,p+'D');
    }
}
