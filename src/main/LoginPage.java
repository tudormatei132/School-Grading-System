package main;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Objects;

public class LoginPage extends JFrame {
    private JLabel username;
    private JTextField usernameField;
    private JLabel password;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel mainPanel;

    public LoginPage() {

        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                if (Objects.equals(username, "root") && Objects.equals(password, "root")) {
                    System.out.println("Login Successful");
                }
            }
        });
    };

    public JLabel getUsername() {
        return username;
    }



    public JPanel getMainPanel() {
        return mainPanel;
    }


    public JButton getLoginButton() {
        return loginButton;
    }



    public JPasswordField getPasswordField() {
        return passwordField;
    }



    public JLabel getPassword() {
        return password;
    }



    public JTextField getUsernameField() {
        return usernameField;
    }


}
