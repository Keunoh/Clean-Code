package comment.time;

public class Response {
    String body;


    public void setBody(String body) {
        this.body = body;
    }

    public void readyToSend(EnoughTime enoughTime) {
        System.out.println("Response.readyToSend");
    }
}
