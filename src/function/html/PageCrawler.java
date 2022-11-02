package function.html;

public interface PageCrawler {

    WikiPage interfaceMethod(String setUpName, WikiPage wikiPage);

    WikiPagePath getFullPath(WikiPage wikiPage);
}
