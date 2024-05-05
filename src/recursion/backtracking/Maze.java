package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    public static void main(String[] args) {
//        maze(3,3,"");
//        System.out.println(count(3,3));
//        System.out.println(mazeList(3,3,""));
        mazeDiagonal(3,3,"");
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
        if (c>1) maze(r,c-1,p+'➡');
        // go down
        if (r>1) maze(r-1,c,p+'⬇');
    }

    private static List<String> mazeList(int r, int c, String p) {
        List<String> list = new ArrayList<>();
        if (c == 1 && r == 1) {
            list.add(p);
            return list;
        }
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();

        // do right
        if (c>1) {
//            left = mazeList(r,c-1,p+'R');
            left = mazeList(r,c-1,p+'➡');
        }
        // go down
        if (r>1) {
            // right = mazeList(r-1,c,p+'D');
            right = mazeList(r-1,c,p+'⬇');
        }
        left.addAll(right);
        return left;
    }

//    Diagonal direction movement added...
    private static void mazeDiagonal(int r,int c,String p) {
        if (c == 1 && r == 1) {
            System.out.print(p+" ");
            return;
        }
        if (r>1 && c>1) mazeDiagonal(r-1,c-1,p+'↘');
        // do right
        if (c>1) mazeDiagonal(r,c-1,p+'➡');
        // go down
        if (r>1) mazeDiagonal(r-1,c,p+'⬇');
    }
}
