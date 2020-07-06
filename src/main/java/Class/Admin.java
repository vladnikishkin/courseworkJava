package Class;

public class Admin implements Interface.Admin {
    private String login = "admin";
    private String password = "qwerapp";
    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
