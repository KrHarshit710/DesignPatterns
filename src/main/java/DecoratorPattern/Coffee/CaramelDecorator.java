package DecoratorPattern.Coffee;

public class CaramelDecorator extends CoffeeDecorator {

	public CaramelDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void makeCoffee() {
		super.makeCoffee();
		System.out.println("Adding caramel.....");

	}

	@Override
	public double getPrice() {
		return 3 + super.getPrice();
	}

}
