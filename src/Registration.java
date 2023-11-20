import javax.swing.*;
import java.io.*;
import java.util.HashMap;

public class Registration {
    private HashMap<String, User> userDatabase;
    private String filePath;


    public Registration(String filePath) {
        this.filePath = filePath;
        this.userDatabase = loadUsers();
    }

    private HashMap<String, User> loadUsers() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            return (HashMap<String, User>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке файла: " + e.getMessage());
            return new HashMap<>();
        }
    }

    private void saveUsers() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(userDatabase);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении файла: " + e.getMessage());
        }
    }

    public void register(String login,String password, AbstractButton regisrtationButton) {



            regisrtationButton.addActionListener(e -> {

                if (userDatabase.containsKey(password)) {
                    JOptionPane.showMessageDialog(null, "Пользователь с таким именем уже существует");

                    //} //else if (users.containsKey(password)) {
                    // JOptionPane.showMessageDialog(null, "Пользователь с таким именем уже существует");

                } else {
                    new User().put("petya", new User());
                    JOptionPane.showMessageDialog(null, "Регистрация прошла успешно");
                }

            });

        }
    }


