package function.html;

public class WikiPagePath {
    public String names;

    public WikiPagePath() {
    }

    public WikiPagePath(String names) {
        this.names = names;
    }

    public int compareTo(WikiPagePath wikiPagePath) {
        if (wikiPagePath != null) {
            return 1;
        } else {
            return -1;
        }
    }
}
