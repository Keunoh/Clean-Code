package function.error;


public class ErrorCode {
    public static final String E_OK = "Essential OK";
    public static final String E_ERROR = "Essential ERROR";

    public String makeSentenceEssential() {
        Page page = new Page();
        Registry registry = new Registry();
        ConfigKeys configKeys = new ConfigKeys();
        Logger logger = new Logger();

        if (deletePage(page) == E_OK) {
            if (registry.deleteReference(page.name) == E_OK) {
                if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
                    logger.log("page deleted");
                } else {
                    logger.log("configKey not deleted");
                }
            } else {
                logger.log("deleteReference from registry failed");
            }
        } else {
            logger.log("delete failed");
            return E_ERROR;
        }
        return "got you!";
    }

    public String deletePage(Page page) {
        if (page != null) {
            return E_OK;
        } else {
            return E_ERROR;
        }
    }
}
