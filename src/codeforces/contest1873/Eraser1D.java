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
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t -- >0) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            sc.nextLine();
//            String string = sc.nextLine();
//
////            System.out.println(removeBlack(string,k,n-1,0));
//            removeBlack("",string,k,n-1,0);
//
//        }
        removeBlack("","BBBBB",5,4,0);

    }

    private static void removeBlack(String p,String up,int k,int upLength,int count) {
        if (up.isEmpty()) {
            System.out.println(count);
            return;
        }
        if (up.charAt(0)=='B') {
            int length = Math.min(upLength,k);
            p = p + up.substring(0,length).replaceAll("B","W");
            removeBlack(p, up.substring(length), k, upLength-(length-1),count+1);
        } else {
            removeBlack(p+'W',up.substring(1),k,upLength-1,count);
        }
    }

//    private static int removeBlack(String up,int k,int upLength,int count) {
//        if (up.isEmpty()) {
//            return 0;
//        }
//        if (up.charAt(0)=='B') {
//            int length = Math.min(upLength,k);
//            return 1 + removeBlack(up.substring(length), k, upLength-(length-1),count+1);
//        } else {
//            return removeBlack(up.substring(1),k,upLength-1,count);
//        }
//    }
}
