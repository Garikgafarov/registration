import javax.swing.*;
import java.awt.*;

public class Main {



    public static void main(String[] args) {
        Registration registration = new Registration("users.ser");
        String login;
        String password;
        User users = new User();


        JFrame frame = new JFrame("Авторизация");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridBagLayout());
        JLabel loginLable = new JLabel("Логин:");
        JLabel passvordLable = new JLabel("Пароль:");
        JTextField loginField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Войти");
        JButton regisrtationButton = new JButton("Регистрация");

        login = loginField.getText();
        password = passwordField.getText();
        registration.register(login, password, regisrtationButton);


        loginButton.addActionListener(e -> {
            if (passwordField.getText().equals("admin") && loginField.getText().equals("admin"))
                JOptionPane.showMessageDialog(null, "Привет, админ!");
            else
                JOptionPane.showMessageDialog(null, "Ты хто, чудовище?");

        });
        frame.add(loginLable);
        frame.add(loginField);
        frame.add(passvordLable);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(regisrtationButton);

    }

        }


