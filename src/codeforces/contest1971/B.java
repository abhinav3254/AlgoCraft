package codeforces.contest1971;

import java.util.Scanner;


// simple logic --> Jyda dimag ni lagana tha.... solved
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t -- >0) {
            String s = sc.nextLine();
            if(check(s)) {
                char ch = s.charAt(0);
                System.out.println("Yes\n"+s.substring(1)+ch);
            } else System.out.println("No");
        }
    }
    
    private static boolean check(String s) {
        if (s.length()<2) return false;
        else {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length-1; i++) {
                if (ch[i]!=ch[i+1]) return true;
            }
            return false;
        }
    }
}
