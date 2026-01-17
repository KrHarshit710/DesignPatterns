package Structural.DecoratorPattern.Pizza.Solution;

public class PaneerDecorator extends PizzaDecorator{

    public PaneerDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Adding Paneer toppings ...");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }
}
