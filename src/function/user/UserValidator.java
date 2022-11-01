package function.user;

public class UserValidator {
    private Cryptographer cryptographer;

    public boolean checkPassword(String username, String password) {
        User user = new UserGateway.findByName(username);
        if (user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if ("Valid Password".equals(phrase)) {
                Session.initialize();   //부수효과
                return true;
            }
        }
        return false;
    }
}
