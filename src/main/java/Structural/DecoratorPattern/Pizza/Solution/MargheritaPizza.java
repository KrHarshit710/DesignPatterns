package Structural.DecoratorPattern.Pizza.Solution;

public class MargheritaPizza implements Pizza{

    @Override
    public void getDescription() {
        System.out.println("Making Margherita Pizza ....");
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
