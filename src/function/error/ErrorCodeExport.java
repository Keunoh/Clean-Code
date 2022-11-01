package function.error;

public class ErrorCodeExport {
    public static final String E_OK = "Essential OK";
    public static final String E_ERROR = "Essential ERROR";

    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        } catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        Registry registry = new Registry();
        ConfigKeys configKeys = new ConfigKeys();

        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name.makeKey());
    }

    private void logError(Exception e) {
        Logger logger = new Logger();
        logger.log(e.getMessage());
    }

    public String deletePage(Page page) {
        if (page != null) {
            return E_OK;
        } else {
            return E_ERROR;
        }
    }
}
