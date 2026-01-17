package Structural.DecoratorPattern.Pizza.Solution;

public class CheeseDominatorPizza implements Pizza {
    @Override
    public void getDescription() {
        System.out.println("Making Cheese Dominator Pizza ....");
    }

    @Override
    public double getPrice() {
        return 150;
    }
}
