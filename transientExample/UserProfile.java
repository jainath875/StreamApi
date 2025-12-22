package transientExample;

import java.io.Serializable;

public class UserProfile implements Serializable {
    private String username;
    private transient String password;
    private int age;

    public UserProfile(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password + ", Age: " + age;
    }
}
