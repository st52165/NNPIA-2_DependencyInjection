package cz.upce.nnpia.di;

public class ArticleService {
    private final EmailService emailService;

    public ArticleService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void publishArticle() {
        //publish article code

        emailService.sendEmail("fanda.silar@email.cz", "Hello Fanda! New article was published.");
    }
}
