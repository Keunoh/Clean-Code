package meaningful_name;

import java.util.ArrayList;
import java.util.List;

public class Page22 {
    int d; // 경과 시간 <- 아무런 의미도 드러나지 않음.

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        List<int[]> theList = new ArrayList<>();

        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
