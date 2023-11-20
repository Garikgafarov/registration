import java.util.Objects;

public class User {
    private String username;
    private String password;
    private String login;


    public User() {
        this.username = username;
        this.password = password;
        this.login = login;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User info = (User) o;
        return Objects.equals(password, info.password) && Objects.equals(login, info.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, login);
    }

    public boolean containsKey(String password) {
        return true;
    }

    public void put(String petya, User user) {

    }
}


