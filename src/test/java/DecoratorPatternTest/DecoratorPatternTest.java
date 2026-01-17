package DecoratorPatternTest;

import Structural.DecoratorPattern.Car.BasicCar;
import Structural.DecoratorPattern.Car.Car;
import Structural.DecoratorPattern.Car.LuxuryCarDecorator;
import Structural.DecoratorPattern.Car.SportsCarDecorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car car = new LuxuryCarDecorator(new SportsCarDecorator(new BasicCar()));
        car.assemble();
    }
}
