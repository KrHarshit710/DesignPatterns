package Structural.AdapterDesignPattern.EmailNotificationExample;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = NotificationServiceFactory.getNotificationService();
        notificationService.send("krharshit.710@gmail.com", "Leave Application", "Kindly grant me leave on 1st Jan");
    }
}
