package Behavioral.ObserverPattern.StockPriceMonitoringSystem;

import java.util.ArrayList;
import java.util.List;

public class Trent implements Observable {
    private String stockSymbol;
    private int stockPrice;
    private List<Observer> subscribers;

    public Trent(String stockSymbol, int stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        this.subscribers = new ArrayList<>();
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(observer -> observer.update(stockSymbol, stockPrice));
    }
}
