package Structural.DecoratorPattern.Pizza.Solution;

public class Client {
    public static void main(String[] args) {
        Pizza paneerOliveCheeseDominatorPizza = new PaneerDecorator(new OliveDecorator(new CheeseDominatorPizza()));
        paneerOliveCheeseDominatorPizza.getDescription();
        System.out.println(paneerOliveCheeseDominatorPizza.getPrice());

        Pizza oliveMargheritaPizza = new OliveDecorator(new MargheritaPizza());
        oliveMargheritaPizza.getDescription();
        System.out.println(oliveMargheritaPizza.getPrice());
    }
}
