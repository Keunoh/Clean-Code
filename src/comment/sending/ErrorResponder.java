package comment.sending;

public class ErrorResponder {

    public static String makeExceptionString(Exception e) {
        return e.getMessage();
    }
}
