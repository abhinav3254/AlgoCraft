package maths;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(findBinary(17));
        System.out.println(findBinaryIteration(17));
        System.out.println(findBinaryIterationReturnInt(17));
        System.out.println(findBinaryReturnInt(0,17));
    }
    private static String findBinary(int n) {
        if (n<=0) {
            return "";
        }
        return n%2+findBinary(n/2);
    }

    private static int findBinaryReturnInt(int result,int n) {
        if (n<=0) {
            return result;
        }
        return findBinaryReturnInt(result*10+(n%2), n/2);
    }

    private static String findBinaryIteration(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n>0) {
            stringBuilder.append(n%2);
            n /= 2;
        }
        return stringBuilder.toString();
    }

    private static int findBinaryIterationReturnInt(int n) {
        int result = 0;
        while (n>0) {
            result = result * 10 + n%2;
            n /= 2;
        }
        return result;
    }
}
