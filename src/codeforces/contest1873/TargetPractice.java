package codeforces.contest1873;

import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t -- >0) {
            String[][] arr = new String[10][10];
            for (int row = 0; row < 10; row++) {
                    arr[row] = sc.nextLine().split("");
            }

            int sum = 0;

            for (int row = 0; row < 10; row++) {
                for (int column = 0; column < 10; column++) {
                    if (arr[row][column].equals("X")) {
                        if (row == 0 || column == 0 || column == arr.length-1 || row == arr.length-1) sum = sum + 1;
                        else
                        if (row == 1 || column == 1 || row == arr.length-2 || column == arr.length-2) sum = sum + 2;
                        else
                        if (row == 2 || column == 2 || row == arr.length-3 || column == arr.length-3) sum = sum + 3;
                        else
                        if (row == 3 || column == 3 || row == arr.length-4 || column == arr.length-4) sum = sum + 4;
                        else sum = sum + 5;
                    }
                }
            }

            System.out.println(sum);
        }
    }
}