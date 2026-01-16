package Behavioral.ObserverPattern.Notification;

import java.util.ArrayList;
import java.util.List;

public class MacBookObservableImpl implements StockObservable {
    public int stockCount = 0;
    List<NotificationAlertObserver> observers = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observers)
            observer.update();
    }

    @Override
    public void setStockCount(int newStockAdded) {
        this.stockCount = this.stockCount + newStockAdded ;
        if(stockCount > 0)
            notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
