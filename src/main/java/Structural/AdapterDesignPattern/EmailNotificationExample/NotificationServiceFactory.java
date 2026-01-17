package Structural.AdapterDesignPattern.EmailNotificationExample;

public class NotificationServiceFactory {
    public static NotificationService getNotificationService(){
        return new SendGridAdapter(new SendGridEmailService());
    }
}
