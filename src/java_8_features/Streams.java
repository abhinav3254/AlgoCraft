package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        // traditional way
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                filteredNames.add(name);
            }
        }
        Collections.sort(filteredNames);
        for (String name : filteredNames) {
            System.out.println(name);
        }

        // Stream API Approach
        names.stream()
                .filter(p->p.startsWith("A"))
                .sorted()
                .forEach(System.out::println);


        System.out.println("-----For each----");
        names.forEach(System.out::println);

    }
}
