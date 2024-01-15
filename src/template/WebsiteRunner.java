package template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        NewsPage newsPage = new NewsPage();
        welcomePage.showPage();
        System.out.println("==========================");
        newsPage.showPage();
    }
}
