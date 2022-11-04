package comment.duty;

import java.util.ArrayList;
import java.util.List;

public class Copy {
    List<CD> cdList = new ArrayList<>();

    /**
     *
     * @param title CD 제목
     * @param author CD 저자
     * @param tracks CD 트랙 숫자
     * @param durationInMinutes CD 길이(단위: 분)
     */
    public void addCD(String title, String author, int tracks, int durationInMinutes) {
        CD cd = new CD();
        cd.title = title;
        cd.author = author;
        cd.tracks = tracks;
        cd.duration = durationInMinutes;
        cdList.add(cd);
    }

}
