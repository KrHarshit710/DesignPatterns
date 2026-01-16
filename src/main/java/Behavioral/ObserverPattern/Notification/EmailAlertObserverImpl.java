package Behavioral.ObserverPattern.Notification;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is back in stock , hurry up !!");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("Email sent with msg : " + msg);
        // send actual email to the end user
    }
}
