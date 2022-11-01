package function.repayroll;

import function.payroll.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
