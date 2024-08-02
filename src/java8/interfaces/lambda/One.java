package java8.interfaces.lambda;

import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,7);

        // this arrow is a lambda function
//        list.forEach(System.out::println);

        A a = new XYZ();

        a.show();

        // instead this we can use this approach
        A b = new A() {
            public void show() {
                System.out.println("Hello from anonymous method");
            }
        };

        b.show();


        // we can reduce the above code into this smaller format

        A c = ()->{
            System.out.println("Hello from anonymous method 2");
        };

        c.show();

    }
}

interface A {
    void show();
}



// The Whole purpose of this method is just is to define the body of interface method
class XYZ implements A {

    @Override
    public void show() {
        System.out.println("Hello");
    }
}
