package comment.sending;

import java.net.SocketException;

public class SendingRefactoring {

    Response response = new Response();

    private void startSending() throws SocketException {
        try {
            doSending();
        } catch (Exception e) {
            addExceptionAndCloseResponse(e);
        }
    }

    private void addExceptionAndCloseResponse(Exception e) {
        try {
            response.add(ErrorResponder.makeExceptionString(e));
            response.closeAll();
        } catch (Exception e1) {

        }
    }

    private void doSending() {
        System.out.println("Sending.doSending");
    }
}
