package function;

import function.html.PageData;

public class HtmlUtilReRefactor {

    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData, boolean isSuite)
            throws Exception {
        if (isTestPage(pageData)) {
            includeSetupAndTeardownPages(pageData, isSuite);
            return pageData.getHtml();
        }

        return "wrong";
    }

    private static boolean isTestPage(PageData pageData) {
        return true;
    }

    private static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {
    }


}
