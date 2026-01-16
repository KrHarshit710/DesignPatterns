package DecoratorPattern.Car;

public class LuxuryCarDecorator extends CarDecorator {

    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Added Luxury Car features .");
    }
}
