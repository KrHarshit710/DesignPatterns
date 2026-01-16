package DecoratorPattern;

import DecoratorPattern.Coffee.CaramelDecorator;
import DecoratorPattern.Coffee.Coffee;
import DecoratorPattern.Coffee.Espresso;
import DecoratorPattern.Coffee.SugarDecorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee coffee = new CaramelDecorator(new SugarDecorator(new Espresso()));
		
		coffee.makeCoffee();
		
		System.out.println("Price : " + coffee.getPrice());
		
		

	}

}
