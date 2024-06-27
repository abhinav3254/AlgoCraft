package practise.hackerrank;

import java.util.*;


//https://www.hackerrank.com/challenges/duplicate-word/problem?isFullScreen=true
public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t -- >0) {
            String s = sc.nextLine();
            removeDuplicates(s);
        }
    }

    private static void removeDuplicates(String str) {
        String[] arr = str.split(" ");
        HashSet<String> hashSet = new HashSet<>();
        Stack<String> stack = new Stack<>();
        for (String temp : arr) {
            if (!hashSet.contains(temp.toLowerCase())) {
                hashSet.add(temp.toLowerCase());
                stack.push(temp);
            }
        }


        String temp2 = "";
        for(String temp:stack) {
            temp2 = temp2 +" "+temp;
        }
        temp2 = temp2.trim();
        System.out.println(temp2);

    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        for (int i = a.size()-1; i >= 0; i++) {
            list.add(a.get(i));
        }
        return list;
    }
}

//1860 41 5555