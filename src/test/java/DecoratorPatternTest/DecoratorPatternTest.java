package DecoratorPatternTest;

import DecoratorPattern.Car.BasicCar;
import DecoratorPattern.Car.Car;
import DecoratorPattern.Car.LuxuryCarDecorator;
import DecoratorPattern.Car.SportsCarDecorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car car = new LuxuryCarDecorator(new SportsCarDecorator(new BasicCar()));
        car.assemble();
    }
}
