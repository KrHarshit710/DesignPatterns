package ObserverPatternTest;

import Behavioral.ObserverPattern.Notification.IphoneObservableImpl;
import Behavioral.ObserverPattern.Notification.MacBookObservableImpl;
import Behavioral.ObserverPattern.Notification.StockObservable;
import Behavioral.ObserverPattern.Notification.EmailAlertObserverImpl;
import Behavioral.ObserverPattern.Notification.MobileAlertObserverImpl;
import Behavioral.ObserverPattern.Notification.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphone = new IphoneObservableImpl();
        StockObservable macbook = new MacBookObservableImpl();
        NotificationAlertObserver harshit = new MobileAlertObserverImpl("7044137084", iphone);
        NotificationAlertObserver sanchit = new MobileAlertObserverImpl("8789380104", iphone);
        NotificationAlertObserver manisha = new EmailAlertObserverImpl("manisha@gmail.com", iphone);
        NotificationAlertObserver rajesh = new EmailAlertObserverImpl("rajesh@gmail.com", macbook);

        iphone.add(harshit);
        iphone.add(sanchit);
        iphone.add(manisha);
        iphone.setStockCount(5);
        iphone.remove(sanchit);
        iphone.setStockCount(-5);
        iphone.setStockCount(2);

        macbook.add(rajesh);
        macbook.setStockCount(2);
    }
}
