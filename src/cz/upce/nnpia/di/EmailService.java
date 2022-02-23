package cz.upce.nnpia.di;

public class EmailService {
    public EmailService() {
        System.out.println("Nová instance!");
    }

    public void sendEmail(String to, String body) {
        System.out.println("Sending email to " + to + " with body:\n" + body);
    }
}
