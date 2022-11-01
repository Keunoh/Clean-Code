package function.error;

public class ErrorCodeTryCatch {

    public static final String E_OK = "Essential OK";
    public static final String E_ERROR = "Essential ERROR";


    public String makeSentenceEssential() {
        Page page = new Page();
        Registry registry = new Registry();
        ConfigKeys configKeys = new ConfigKeys();
        Logger logger = new Logger();

        try {
            deletePage(page);
            registry.deleteReference(page.name);
            configKeys.deleteKey(page.name.makeKey());
        } catch (Exception e) {
            logger.log(e.getMessage());
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
