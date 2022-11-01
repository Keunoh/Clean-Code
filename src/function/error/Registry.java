package function.error;

public class Registry {

    public String deleteReference(Name pageName) {
        if (pageName.equals("hacking")) {
            return ErrorCode.E_OK;
        } else {
            return ErrorCode.E_ERROR;
        }
    }
}
