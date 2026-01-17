package Structural.DecoratorPattern.Pizza.Problem;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new CheeseOlivePizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
