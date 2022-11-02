package comment.intension;

public class Employee {
    public boolean flags = true;
    public int age;

    public boolean isEligibleForFullBenefits() {
        if(flags)
            return true;
        else
            return false;
    }
}
