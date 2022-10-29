package meaningfulname;

public class Page29 {
    public static void main(String[] args) {
        //비교 1.
        int s=0;
        int[] t = {1, 2, 3};
        for(int j=0; j<34; j++){
            s += (t[j]*4)/5;
        }

        //비교 2.
        int realDaysPerIdealDay = 4;
        int[] taskEstimate = {1, 2, 3};
        final int WORK_DAYS_PER_WEEK = 5;
        final int NUMBER_OF_TASKS = 3;

        int sum = 0;
        for(int j=0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }
}



