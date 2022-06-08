package Task1;

import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {
    private JPanel pMain;
    private JLabel jlIcon;
    private JLabel jlUsername;
    private JLabel jlPassword;
    private JTextField jtfUsername;
    private JTextField jtfPassword;
    private JButton jbOK;
    private JButton jbCancel;


    public Task1() {
        super("Login");
        pMain = new JPanel();
        pMain.setLayout(new FlowLayout());

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

        pMain.add(jlIcon);
        pMain.add(jlUsername);
        pMain.add(jtfUsername);
        pMain.add(jlPassword);
        pMain.add(jtfPassword);
        pMain.add(jbOK);
        pMain.add(jbCancel);
    }

    public static void main(String[] args) {
        Task1 login = new Task1();
        login.setTitle("Login");
        login.setContentPane(login.pMain);
        login.setVisible(true);
        login.setSize(300, 220);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
