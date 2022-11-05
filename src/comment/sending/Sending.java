package comment.sending;

import java.net.SocketException;

public class Sending {

    Response response = new Response();

    private void startSending() throws SocketException {
        try {
            doSending();
        } catch (Exception e) {
            try {
                response.add(ErrorResponder.makeExceptionString(e));
                response.closeAll();
            } catch (Exception e1) {
                //이게 뭐야!
            }
        }
    }

    private void doSending() {
        System.out.println("Sending.doSending");
    }

}
