package comment.mumbling;

import java.io.FileInputStream;
import java.io.IOException;

public class NoReason {
    String propertiesLocation = "URI includes URL + URN";
    private final String PROPERTIES_FILE = "We call URI and URL are the same";

    LoadedProperties loadedProperties;

    public void loadProperties() {
        try {
            String propertiesPath = propertiesLocation + "/" + PROPERTIES_FILE;
            FileInputStream propertiesStream = new FileInputStream(propertiesPath);
            loadedProperties.load(propertiesStream);
        } catch (IOException e) {
            // 속성 파일이 없다면 기본값을 모두 메모리로 읽어 들였다는 의미이다.
        }
    }

}
