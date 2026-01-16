package Behavioral.ObserverPattern.Notification;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String mobileNo;
    StockObservable observable;

    public MobileAlertObserverImpl(String mobileNo, StockObservable observable) {
        this.mobileNo = mobileNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(mobileNo, "Product is back in stock , hurry up !!");
    }

    private void sendMail(String mobileNo, String msg) {
        System.out.println("Sms sent with msg : " + msg);
        // send actual sms to the end user
    }
}
