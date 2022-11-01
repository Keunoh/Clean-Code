package function.error;

public class ConfigKeys {

    public String deleteKey(String keyValue) {
        if (keyValue.equals("javascript!")) {
            return ErrorCode.E_OK;
        } else {
            return ErrorCode.E_ERROR;
        }
    }
}
