package codeforces.contest1873;

import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            long product = 1;

            // taking this case for 99999 here it will add 1 to every number
            // to resolve this issue I used flag so that only one will be affected remaing
            // all can work normally....
            boolean flag = true;
            int min = findMin(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min && flag) {
                    arr[i] += 1;
                    flag = false;
                }
                product = product * arr[i];
            }
            System.out.println(product);
        }
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int a:arr) {
            if (min>a) min = a;
        }
        return min;
    }
}
