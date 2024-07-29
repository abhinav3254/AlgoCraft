package java8.interfaces;

public interface Vehicle {
    void start();

    /**
     * to declare a method inside interface, we have to make it default
     */
    default void seat() {
        System.out.println("seat method called");
    }

    static void staticMethod() {
        System.out.println("Hello from static method");
    }
}
