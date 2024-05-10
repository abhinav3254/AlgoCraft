package maths;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arrPositiveNegative = {-1,-2,5,6,-4,-3,1,3,-5,2,4};
        System.out.println(removePositiveAndNegative(arrPositiveNegative));
        int[] arr = {1,2,3,4,5,12,1,2,4,3,5};
        System.out.println(findUnique(arr));
    }

    private static int removePositiveAndNegative(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }

    private static int findUnique(int[] arr) {
        int sum = 0;
        for(int i:arr) {
            sum = sum ^ i;
        }
        return sum;
    }
}
