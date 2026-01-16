package StrategyPattern;

import Behavioral.StrategyPattern.ShoppingCart;
import Behavioral.StrategyPattern.UPIPayment;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // add items

        cart.pay(new UPIPayment("7044137084@okaxis", "5555"));
    }
}
