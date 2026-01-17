package Structural.AdapterDesignPattern.EmailNotificationExample;

public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Sending Email to " + to);
        System.out.println("Subject of the email is " + subject);
        System.out.println("Body of the email is " + body);
    }
}
