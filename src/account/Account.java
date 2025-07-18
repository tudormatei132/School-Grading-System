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

}
