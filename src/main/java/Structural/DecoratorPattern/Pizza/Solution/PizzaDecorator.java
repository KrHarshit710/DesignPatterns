package Structural.DecoratorPattern.Pizza.Solution;

public abstract class PizzaDecorator implements Pizza {
    private Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public void getDescription() {
        decoratedPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice();
    }
}
