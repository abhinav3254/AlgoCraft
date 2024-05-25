package practise.biweekly_contest_131;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


// 100313. Find the Number of Distinct Colors Among the Balls
// easy need to do later after tournament; right now I have some other work that's why I need to go...
// solved this one as well
public class Distinct {

    public static void main(String[] args) {
        int limit = 4;
        int[][] queries = {{1,4},{2,5},{1,3},{3,4}};
//        int[][] queries = {{0,1},{1,2},{2,2},{3,4},{4,5}};
        System.out.println(Arrays.toString(queryResultsOpt(limit,queries)));
    }

    public static int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            map.put(ball,color);
            int unique = countUniqueValues(map);
            arr[i] = unique;
        }
        return arr;
    }

    private static int countUniqueValues(HashMap<Integer, Integer> map) {
        HashSet<Integer> uniqueValues = new HashSet<>(map.values());
        return uniqueValues.size();
    }

    public static int[] queryResultsOpt(int limit, int[][] queries) {
        HashMap<Integer, Integer> ballToColorMap = new HashMap<>();
        HashMap<Integer, Integer> colorFrequencyMap = new HashMap<>();
        int[] result = new int[queries.length];
        int uniqueColorsCount = 0;

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];

            if (ballToColorMap.containsKey(ball)) {
                int oldColor = ballToColorMap.get(ball);
                if (colorFrequencyMap.get(oldColor) == 1) {
                    uniqueColorsCount--;
                }
                colorFrequencyMap.put(oldColor, colorFrequencyMap.get(oldColor) - 1);
            }

            ballToColorMap.put(ball, newColor);
            colorFrequencyMap.put(newColor, colorFrequencyMap.getOrDefault(newColor, 0) + 1);
            if (colorFrequencyMap.get(newColor) == 1) {
                uniqueColorsCount++;
            }

            result[i] = uniqueColorsCount;
        }

        return result;
    }

}
