package function;

public class WikiPage {

    private String setUpName;
    private WikiPage wikiPage;

    public WikiPage() {

    }

    public WikiPage(String setUpName, WikiPage wikiPage) {
        this.setUpName = setUpName;
        this.wikiPage = wikiPage;
    }

    public Page getPageCrawler() {
        return new Page();
    }
}
