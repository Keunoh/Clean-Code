package function.repayroll;

import function.payroll.InvalidEmployeeType;

public class EmployeeFactoryImpl implements EmployeeFactory {
    private static final int COMMISSIONED = 1;
    private static final int HOURLY = 2;
    private static final int SALARIED = 3;

    @Override
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
        switch (r.type) {
            case COMMISSIONED:
                return new CommissionedEmployee(r);
            case HOURLY:
                return new HourlyEmployee(r);
            case SALARIED:
                return new SalariedEmployee(r);
            default:
                throw new InvalidEmployeeType(r.type);
        }
    }
}
