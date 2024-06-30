package practise.gfg;

public class CompeteTheSkills {
    public static void main(String[] args) {

    }

    public void scores(long a[], long b[]) {
        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) bScore = bScore + 1;
            else if (a[i] > b[i]) aScore = aScore + 1;
        }
        System.out.println(aScore+" "+bScore);
    }

}
