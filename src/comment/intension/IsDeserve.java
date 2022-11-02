package comment.intension;

public class IsDeserve {
    private static final boolean HOURLY_FLAG = true;
    private Employee employee = new Employee();

    //직원에게 복지 혜택을 받을 자격이 있는지 검사한다.
    public void isDeservePay(){
        if ((employee.flags & HOURLY_FLAG) && (employee.age > 65))
            System.out.println("yes");
    }

    //이 함수가 더 의도를 잘 표현한다.
    public void goodIntension() {
        if (employee.isEligibleForFullBenefits()) {
            System.out.println("yes");
        }
    }
}
