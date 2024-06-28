package lambda;


import java.util.ArrayList;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach((n)->{
            System.out.print(n+" ");
        });

    }
}
