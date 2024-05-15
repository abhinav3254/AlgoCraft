package practise;

public class NElephants {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        position(arr,0);
    }

    private static void position (boolean[][] arr,int row) {
        if (row == arr.length) {
            print(arr);
            return;
        }
        for (int col = 0; col < arr.length; col++) {
            if (isSafe(arr,row,col)) {
                arr[row][col] = false;
                position(arr, row+1);
                arr[row][col] = true;
            }
        }
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

    private static boolean isSafe(boolean[][] arr,int row,int col) {

        // checking horizontal cells
        for (int i = 0; i < col; i++) {
            if (!arr[row][i]) return false;
        }

        // checking vertically
        for (int i = 0; i < row; i++) {
            if (!arr[i][col]) return false;
        }

        return true;
    }
}
