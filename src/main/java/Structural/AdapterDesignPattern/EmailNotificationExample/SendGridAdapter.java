package Structural.AdapterDesignPattern.EmailNotificationExample;

public class SendGridAdapter implements NotificationService{
    private SendGridEmailService sendGridEmailService;

    public SendGridAdapter(SendGridEmailService sendGridEmailService) {
        this.sendGridEmailService = sendGridEmailService;
    }

    @Override
    public void send(String to, String subject, String body) {
        sendGridEmailService.sendEmail(to, subject, body);
    }
}
