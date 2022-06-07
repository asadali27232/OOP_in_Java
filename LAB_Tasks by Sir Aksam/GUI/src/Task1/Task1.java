import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {
    private JLabel jlIcon;
    private JLabel jlUsername;
    private JLabel jlPassword;
    private JTextField jtfUsername;
    private JTextField jtfPassword;
    private JButton jbOK;
    private JButton jbCancel;


    public Task1() {
        super("Login");
        setLayout(new FlowLayout());

        Icon icon = new ImageIcon(getClass().getResource("img_ClientDB.png"));
        jlIcon = new JLabel();
        jlIcon.setIcon(icon);

        jlUsername = new JLabel("Username");
        jlPassword = new JLabel("Password");

        String username = JOptionPane.showInputDialog("Enter Username:");
        String password = JOptionPane.showInputDialog("Enter Password:");

        jtfUsername = new JTextField(15);
        jtfUsername.setText(username);
        jtfPassword = new JTextField(15);
        jtfPassword.setText(password);

        jbOK = new JButton("Ok");
        jbCancel = new JButton("Cancel");

        add(jlIcon);
        add(jlUsername);
        add(jtfUsername);
        add(jlPassword);
        add(jtfPassword);
        add(jbOK);
        add(jbCancel);
    }

    public static void main(String[] args) {
        Task1 login = new Task1();
        login.setVisible(true);
        login.setSize(300, 220);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
