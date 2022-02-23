package cz.upce.nnpia.di;

public class UserService {
    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createAccount() {
        //create account code

        emailService.sendEmail("fanda.silar@email.cz", "Hello Fanda!");
    }
}
