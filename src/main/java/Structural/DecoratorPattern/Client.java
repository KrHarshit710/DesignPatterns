package Structural.DecoratorPattern;

import Structural.DecoratorPattern.Coffee.CaramelDecorator;
import Structural.DecoratorPattern.Coffee.Coffee;
import Structural.DecoratorPattern.Coffee.Espresso;
import Structural.DecoratorPattern.Coffee.SugarDecorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee coffee = new CaramelDecorator(new SugarDecorator(new Espresso()));
		
		coffee.makeCoffee();
		
		System.out.println("Price : " + coffee.getPrice());
		
		

	}

}
