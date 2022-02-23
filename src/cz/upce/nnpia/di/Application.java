package cz.upce.nnpia.di;

public class Application implements ArticleApp{
    UserService userService;
    ArticleService articleService;

    public Application(UserService userService, ArticleService articleService) {
        this.userService = userService;
        this.articleService = articleService;
    }

    public static void main(String[] args) {
        Application application = DependencyInjector.getArticleApp();
        application.process();
    }

    @Override
    public void process() {
        userService.createAccount();
        articleService.publishArticle();
    }
}
