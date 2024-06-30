package practise.leetcode;


import java.util.Scanner;

// 50. Pow(x, n)
// https://leetcode.com/problems/powx-n/description/
public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        int n = sc.nextInt();

        if (n > 0) {
            // multiply
            multiply(input,n);
        } else if (n < 0) {
            // divide
            divide(input,n);
        } else {
            System.out.println(input);
        }
    }

    private static void multiply (double input,int n) {
        double output = 1;
        for (int i = 0; i < n; i++) {
            output = output * input;
        }
        System.out.format("%.5f",output);
    }

    private static void divide (double input,int n) {
        double output = 1;
        int i = n;
        while (i<0) {
            output = output * input;
            i = i + 1;
        }
        System.out.println(1/output);
    }


}
