package Structural.AdapterDesignPattern.EmailNotificationExample;

public class SendGridEmailService {
    public void sendEmail(String receiver, String title, String content){
        System.out.println("Receiver : " + receiver);
        System.out.println("Title : " + title);
        System.out.println("Content : " + content);
    }
}
