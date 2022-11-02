package comment.intension;

import function.html.WikiPagePath;

import java.util.concurrent.atomic.AtomicBoolean;

public class Description {
    String names;

    public int compareTo(Object o) {
        if(o instanceof WikiPagePath) {
            WikiPagePath p = (WikiPagePath) o;
            String compressedName = StringUtil.join(names, "");
            String compressedArgumentName = StringUtil.join(p.names, "");
            return compressedName.compareTo(compressedArgumentName);
        }
        return 1; // 옳은 유형이므로 정렬 순위가 더 높다.
    }

    public void testConcurrentAddWidgets() throws Exception {
        WidgetBuilder widgetBuilder =
                new WidgetBuilder(new Class[]{BoldWidget.class});
        String text = "'''bold text'''";
        ParentWidget parent = new BoldWidget(new MockWidgetRoot(), "'''bold text'''");
        AtomicBoolean failFlag = new AtomicBoolean();
        failFlag.set(false);

        //스레드를 대량 생성하는 방법으로 어떻게든 경쟁 조건을 만들려 시도한다.
        for (int i = 0; i < 25000; i++) {
            WidgetBuilderThread widgetBuilderThread =
                    new WidgetBuilderThread(widgetBuilder, text, parent, failFlag);
            Thread thread = new Thread(widgetBuilderThread);
            thread.start();
        }
        assertEquals(false, failFlag.get());
    }

    public static void assertEquals(boolean defaultFlag, boolean failFlag) {
        System.out.println("defaultFlag = " + defaultFlag);
        System.out.println("failFlag = " + failFlag);

    }
}
