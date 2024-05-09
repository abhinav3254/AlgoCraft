package codeforces.contest1873;

import java.util.Scanner;

public class ShortSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-->0) {

            String word = sc.nextLine();

            if (word.charAt(0) == 97 || word.charAt(1) == 98 || word.charAt(2) == 99)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
