package function.payroll;

public class InvalidEmployeeType extends RuntimeException {

    public InvalidEmployeeType(String type) {
        System.out.println("type = " + type);
    }

    public InvalidEmployeeType(int flag) {
        System.out.println("flag = " + flag);
    }
}
