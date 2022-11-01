package function.user;

public class UserGateway {


    public static class findByName extends User {
        public findByName(String username) {
            super(username);
        }
    }
}
