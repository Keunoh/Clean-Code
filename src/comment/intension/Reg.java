package comment.intension;

import java.util.regex.Pattern;

public class Reg {

    //kk:mm:ss EEE, MMM dd, yyyy 형식이다.
    Pattern timeMatcher = Pattern.compile(
            "\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*"
    );
}
