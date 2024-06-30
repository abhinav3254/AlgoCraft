package practise.gfg;

public class Compute {
    public static void main(String[] args) {
        int[] arr = {2, 55, 85, 656, 52, 554, 545, 5, 2};
        System.out.println(average(arr,arr.length));;
    }
    public static String average(int arr[], int N) {
        int sum = 0;
        for (int i=0;i<N;i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / N;

        String item = avg+"";
        for (int i = 0; i < item.length(); i++) {
            if (item.charAt(i)=='.') {

            }
        }
        return null;
    }
}
