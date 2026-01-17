package Structural.AdapterDesignPattern.EmailNotificationExample;

public interface NotificationService {
    void send(String to, String subject, String body);
}
