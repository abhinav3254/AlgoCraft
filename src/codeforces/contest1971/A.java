package codeforces.contest1971;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -- >0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(Math.min(a,b)+" "+Math.max(a,b));
        }
    }
}
