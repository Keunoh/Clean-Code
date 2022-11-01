package function.user;

public class User {
    public static final User NULL = null;
    String username;

    public User(String username) {
        this.username = username;
    }

    public String getPhraseEncodedByPassword() {
        return "encoded phrase!";
    }
}
