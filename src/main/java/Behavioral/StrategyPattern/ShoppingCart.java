package Behavioral.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(Item item) {
        return  items.remove(item);
    }

    public void pay(PaymentStrategy strategy) {
        int amount = calculateAmount();
        strategy.pay(amount);
    }

    private int calculateAmount() {
        return 0;
    }
}
