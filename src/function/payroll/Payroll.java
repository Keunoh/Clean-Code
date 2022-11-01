package function.payroll;

public class Payroll {
    private final String COMMISSIONED = "commission";
    private final String HOURLY = "hourly";
    private final String SALARIED = "salary";

    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }

    public Money calculateCommissionedPay(Employee employee) {
        System.out.println("employee = " + employee);
        return new Money(COMMISSIONED);
    }

    public Money calculateHourlyPay(Employee employee){
        System.out.println("employee = " + employee);
        return new Money(HOURLY);
    }

    public Money calculateSalariedPay(Employee employee) {
        System.out.println("employee = " + employee);
        return new Money(SALARIED);
    }
}
