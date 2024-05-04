package recursion.questions;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
    }

    // This will give combinations of all the number of number which will make 4
    private static void dice(String p, int target) {
        if (target == 0) {
            System.out.print(p + " ");
            return;
        }
        for (int i = 1; i < 7 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }
}
