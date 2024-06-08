package practise.biweekly_contest_132;


// 100297
public class KGames {
    public static void main(String[] args) {
        int[] arr = {2,5,4};
        int k = 3;
        System.out.println(kGamesInARow(arr,k));
    }

    public static int kGamesInARow(int[] skills,int k) {
        int currentIndex = 0;
        int nextIndex = 1;
        int wins = 0;
        while (nextIndex < skills.length) {
            if (skills[currentIndex]>skills[nextIndex]) {
                wins = wins + 1;
                nextIndex++;
            } else {
                currentIndex = nextIndex;
                nextIndex++;
                wins = 1;
            }
            if (k <= wins) {
                break;
            }
        }
        return currentIndex;
    }
}
