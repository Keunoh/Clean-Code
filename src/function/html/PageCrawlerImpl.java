package function.html;

public class PageCrawlerImpl implements PageCrawler {

    public static WikiPage getInheritedPage(String setUpName, WikiPage wikiPage) {
        WikiPage inheritedPage = new WikiPage(setUpName, wikiPage);
        return inheritedPage;
    }

    @Override
    public WikiPage interfaceMethod(String setUpName, WikiPage wikiPage) {
        return null;
    }

    @Override
    public WikiPagePath getFullPath(WikiPage wikiPage) {
        return null;
    }
}
