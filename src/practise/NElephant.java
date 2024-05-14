package practise;

public class NElephant {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        secondChance(arr,0);
    }


    // assuming the board n x n
    private static void elephants(boolean[][] arr,int row) {
        if (row == arr.length) {
            print(arr);
            return;
        }
        for (int column = 0; column < arr.length; column++) {
            if (isSafe(arr,row,column)) {
                arr[row][column] = false;
                elephants(arr,row+1);
                arr[row][column] = true;
            }
        }
    }

    private static boolean isSafe(boolean[][] arr,int r,int c) {
        // checking downwards if there is any elephant in the row
        for (int i = 0; i < r; i++) {
            if (!arr[i][c]) return false;
        }

        // checking horizontally if there is any elephant
        for (int i = 0; i < c; i++) {
            if (!arr[r][i]) return false;
        }

        return true;
    }

    private static void print(boolean[][] arr) {
        for (boolean[] column:arr) {
            for(boolean row:column) {
                if (!row) System.out.print("E ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void secondChance(boolean[][] arr,int column) {
        if (column == arr.length) {
            print(arr);
            return;
        }
        for (int row = 0; row < arr.length; row++) {
            if(isSafe(arr,row,column)) {
                arr[row][column] = false;
                secondChance(arr,column+1);
                arr[row][column] = true;
            }
        }
    }
}
