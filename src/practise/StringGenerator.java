package practise;


// link to problem
public class StringGenerator {
    public static void main(String[] args) {
        char[] arr = {'a','b'};
        int n = arr.length;
        int k = 3;
        print(arr,"",n,k);
    }

    private static void print(char[] arr,String processed,int n,int k) {
        if (k == 0) {
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < n; i++) {
            String newString = processed + arr[i];
            print(arr, newString, n, k-1);
        }
    }
}
