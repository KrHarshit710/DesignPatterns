package DecoratorPattern.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee(){
        coffee.makeCoffee();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}