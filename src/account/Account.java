package account;

import main.Utils;

public class Account {
    private int id;
    private String username, password;
    private Utils.rights rights;

    public Account(final int id, final String username, final String password, final Utils.rights rights) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rights = rights;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utils.rights getRights() {
        return rights;
    }

    public void setRights(Utils.rights rights) {
        this.rights = rights;
    }
}
