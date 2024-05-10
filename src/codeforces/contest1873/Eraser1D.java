package codeforces.contest1873;

import java.util.Scanner;

public class Eraser1D {
    // okay I am writing idea how I am going to solve it....
    /**
     * input :-
     *          6 3
     *          WBWWWB
     * iterate while B is not found,
     * now B is found from there we cab take 3 substring then turn all all of them W in on round
     * the again iterate whike B is not found then If B is found then again repeat
     *<p></p>
     * to optimize this we will check if the String contains B or not
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- >0) {
            int length = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String string  = sc.nextLine();
            System.out.println(changeAllWhites(string, length, k));
        }
    }
    // Here issue is TLE
    private static int changeAllWhites(String p,int remaining,int k) {
        if (p.isEmpty()) return 0;
        if (remaining<k && p.charAt(0) == 'B') {
            return 1;
        } else {
            if (p.charAt(0) == 'B') {
                return 1 + changeAllWhites(p.substring(k), remaining-k, k);
            } else {
                return changeAllWhites(p.substring(1), remaining-1, k);
            }
        }
    }
}
