package comment.time;


import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class EnoughTime {
    static String testFile = "testFile";
    static int bytesSent = 100000;

    Response response = new Response();
    Output output = new Output();

    //여유 시간이 충분하지 않다면 실행하지 마십시오.
    public void _testWithReallyBigFile() {
        writeLinesToFile(10000000);

        response.setBody(testFile);
        response.readyToSend(this);
        String responseString = output.toString();
        assertSubString("Content-Length: 100000000", responseString);
        assertTrue(bytesSent > 100000000);
    }

    public static SimpleDateFormat makeStandardHttpDateFormat() {
        //SimpleDateFormat은 스레드에 안전하지 못하다.
        //따라서 각 인스턴스를 독립적으로 생성해야 한다.
        SimpleDateFormat df = new SimpleDateFormat("EEE, dd MMM  yyyy HH:mm:ss z");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df;
    }

    public void assertTrue(boolean isBig) {
        if (isBig) {
            System.out.println("EnoughTime.assertTrue");
        } else {
            System.out.println("Not Enough Mineral");
        }
    }

    public void assertSubString(String contentLength, String responseString) {
        System.out.println("contentLength = " + contentLength);
        System.out.println("responseString = " + responseString);
        System.out.println("EnoughTime.assertSubString");
    }

    public void writeLinesToFile(int number) {
        System.out.println("EnoughTime.writeLinesToFile");
    }
}
