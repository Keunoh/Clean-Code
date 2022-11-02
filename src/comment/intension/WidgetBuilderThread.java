package comment.intension;

import java.util.concurrent.atomic.AtomicBoolean;

public class WidgetBuilderThread implements Runnable {
    WidgetBuilder widgetBuilder;
    String text;
    ParentWidget parent;
    AtomicBoolean failFlag;
    public WidgetBuilderThread(WidgetBuilder widgetBuilder, String text, ParentWidget parent, AtomicBoolean failFlag) {
        this.widgetBuilder = widgetBuilder;
        this.text = text;
        this.parent = parent;
        this.failFlag = failFlag;
    }

    @Override
    public void run() {

    }
}
