package function.html;

public class PathParser {
    public static String render(WikiPagePath pagePath){
        return "page path";
    }

    public static WikiPagePath parse(String page) {
        return new WikiPagePath(page);
    };
}
