package comment.duty;

public class AnnualDateRule {

    /**
     * 기본생성자
     */
    protected AnnualDateRule() {
    }

    /** 월 중 일자 */
    private int dayOfMonth;

    /**
     * 월 중 일자를 반환한다.
     * @return 월 중 일자
     */
    public int getDayOfMonth() {
        return dayOfMonth;
    }
}
