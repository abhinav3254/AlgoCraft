package java8.interfaces;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.seat();

        Vehicle.staticMethod();
    }
}
