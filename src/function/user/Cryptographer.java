package function.user;

public class Cryptographer {
    public String decrypt(String codedPhrase, String password) {
        return codedPhrase + " " + password;
    }
}
