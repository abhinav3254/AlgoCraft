package maths;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(convertToDecimalIteration(10001));
        System.out.println(convertToDecimal(10001,0,0));
    }
    private static int convertToDecimalIteration(int n) {
        int sum = 0;
        int i = 0;
        while (n>0) {
            sum = (int) (sum + (n%10*Math.pow(2,i)));
            i = i + 1;
            n /= 10;
        }
        return sum;
    }


    // even braces make diff..... ha ha ha
    private static int convertToDecimal(int n,int result,int count) {
        if (n<=0) return result;
        return convertToDecimal(n/10,(int)(result+(n%10*Math.pow(2,count))),count+1);
    }
}
