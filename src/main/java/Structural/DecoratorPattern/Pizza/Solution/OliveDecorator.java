package Structural.DecoratorPattern.Pizza.Solution;

public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Adding Olive toppings ...");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20;
    }
}
