package DecoratorPattern.Coffee;

public class Latte implements Coffee {

	@Override
	public void makeCoffee() {
		System.out.println("Making latte....");

	}

	@Override
	public double getPrice() {
		return 10;
	}

}
