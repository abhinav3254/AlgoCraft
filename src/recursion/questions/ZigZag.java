package recursion.questions;

import java.util.Arrays;

public class ZigZag {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] numbers) {
        int[] arr = new int[numbers.length-2];
        int length = numbers.length;
        for (int i = 0; i < length-2; i++) {
            int a = numbers[i];
            int b = numbers[i+1];
            int c = numbers[i+2];
            if (a < b && b>c) {
                arr[i] = 1;
            } else if (a>b && b<c) arr[i] = 1;
        }
        return arr;
    }

}
