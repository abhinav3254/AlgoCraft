package recursion.assignments;

import java.util.Arrays;
import java.util.HashMap;

public class Assignments {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        sumOfTriangles2(arr,arr.length-1);

//        firstUpperCaseInString("geeksforgeeKsA");
//        reverseString("abhinav","",6);
//        print1ToN(5);
//        System.out.println(fib(4));
//        calStringLength("abhinav",0);
//        System.out.println(geekonacciSeries(1,3,2,6));
//        System.out.println(sumOfDigits(123));
//        System.out.println(productOfTwoNumbers(2,5));
//        System.out.println(checkPrimeIteration(7));
//        System.out.println(isPowerOfFour(-2147483648));
    }


    // question 1 solved using recursion
    // link to problem :- https://www.geeksforgeeks.org/sum-triangle-from-array/
    private static void sumOfTriangles2(int[] arr,int end) {
        if (arr.length == 0) return;
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[end];
        for (int i = 0;i<end;i++) {
            temp[i] = arr[i]+arr[i+1];
        }
        sumOfTriangles2(temp,end-1);
    }


    // To solve using iteration is pending... once I will be back I will solve this one
    private static void sumOfTrianglesIteration() {}


    // printing the first upper case from the given string...
    private static void firstUpperCaseInString(String str) {
        // A --> 65 and B --> 90 these are ASCII values
        if (str.isEmpty()) return;
        int c = str.charAt(0);
        // In this range all the numbers are Uppercase
        if (c>=65 && c<=90) {
            // If number is Upper case then type cast that number to char and print it
            // then return the function call because we need to get the first upper case only
            System.out.println((char)c);
            return;
        }
        firstUpperCaseInString(str.substring(1));
    }

    // reverse string using recursion
    private static void reverseString(String s,String n,int index) {
        if (index < 0) {
            System.out.println(n);
            return;
        }
        n = n + s.charAt(index);
        reverseString(s,n,index-1);
    }

    // print 1 to N without loop
    private static void print1ToN(int n) {
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print1ToN(n-1);
    }

    private static int fib(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return fibHelper(n,map);
    }

    // used dp for code optimization
    private static int fibHelper(int n,HashMap<Integer,Integer> map) {
        if (map.containsKey(n)) return map.get(n);
        if (n == 0) return 0; else if (n == 1) return 1;
        map.put(n,fibHelper(n-1,map)+fibHelper(n-2,map));
        return map.get(n);
    }


    // calculating length of string using recursion...
    private static void calStringLength(String s,int index) {
        if (s.isEmpty()) {
            System.out.println(index);
            return;
        }
        calStringLength(s.substring(1),index+1);
    }

    // Geek-onacci Number
    private static int geekonacciSeries(int A,int B,int C,int n) {
        if (n == 1) return A;
        if (n == 2) return B;
        if (n == 3) return C;
        return geekonacciSeries(A,B,C,n-1)+geekonacciSeries(A,B,C,n-2)+geekonacciSeries(A,B,C,n-3);
    }

    // sum of digits code
    private static int sumOfDigits(int n) {
        if (n<=0) {
            return 0;
        }
        int m = n%10;
        return m+sumOfDigits(n/10);
    }

    // product of two numbers
    private static int productOfTwoNumbers(int n,int m) {
        if (n == 0) return 0;
        return m+productOfTwoNumbers(n-1,m);
    }

    private static boolean checkPrimeIteration(int n) {
        if (n<2) return false;
        for (int i = 2; i < n-1; i++) {
            if (n%i== 0) return false;
        }
        return true;
    }




}