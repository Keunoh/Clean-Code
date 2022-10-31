package function.html;

public class PageData {

    public WikiPage getWikiPage() {
        return new WikiPage();
    }

    public boolean hasAttribute(String sentence) {
        String test = "Test";
        if (sentence.equals(test)) {
            return true;
        } else {
            return false;
        }
    }

    public String getContent() {
        return "content";
    }

    public void setContent(String linesFromBuffer) {
        System.out.println("linesFromBuffer = " + linesFromBuffer);
    }

    public String getHtml() {
        return "this is the final html";
    }
}
