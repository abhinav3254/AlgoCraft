package practise.gfg;

import java.util.Arrays;


// problem statement :- https://www.geeksforgeeks.org/problems/average4856/1?page=1&category=Arrays&difficulty=School&status=unsolved&sortBy=submissions
public class StreamAverage {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(streamAvg(arr,arr.length)));
    }

    static float[] streamAvg(int[] arr, int n) {
        int[] temp = new int[n];
        float[] ans = new float[n];

        ans[0] = arr[0];
        temp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            float k = arr[i] + temp[i-1];
            temp[i] = arr[i]+temp[i-1];
            ans[i] = k/(i+1);
        }
        return ans;
    }

}
