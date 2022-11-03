package comment.mumbling;

import java.io.FileInputStream;

public class LoadedProperties {

    public void load(FileInputStream fileInputStream) {
        System.out.println("fileInputStream = " + fileInputStream);
        System.out.println("LoadedProperties.load");
    }
}
