package comment.sending;

public class Response {

    public void add(String message) {
        System.out.println("message = " + message);
    }

    public void closeAll() {
        System.out.println("Response.closeAll");
    }
}
