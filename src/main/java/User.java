public class User {
    private int id;
    private String login;
    private String pass;

    User(int id, String login, String pass) {

    }

    User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String email) {
        this.pass = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " id " + id + " login = " + login + " pass = " + pass;
    }
}
