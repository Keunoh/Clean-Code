package function.payroll;

public class InvalidEmployeeType extends RuntimeException {
    public InvalidEmployeeType(String type) {
        System.out.println("type = " + type);
    }
}
