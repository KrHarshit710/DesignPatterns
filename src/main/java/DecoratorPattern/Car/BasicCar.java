package DecoratorPattern.Car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembled Basic Car.");
    }
}
