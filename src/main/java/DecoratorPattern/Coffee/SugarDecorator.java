package DecoratorPattern.Coffee;

public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void makeCoffee() {
		super.makeCoffee();
		System.out.println("Adding sugar.....");
	}

	@Override
	public double getPrice() {
		return 2 + super.getPrice();
	}
}
