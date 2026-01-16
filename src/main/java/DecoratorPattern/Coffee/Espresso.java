package DecoratorPattern.Coffee;

public class Espresso implements Coffee {

	@Override
	public void makeCoffee() {
		System.out.println("Making espresso.....");
	}

	@Override
	public double getPrice() {
		return 12;
	}

}
