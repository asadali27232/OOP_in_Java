package Task2;

import javax.swing.*;

public class Login extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton OKButton;
    private JButton cancelButton;

    public static void main(String[] args)
    {
        Login login = new Login();
        login.setContentPane(login.mainPanel);
        login.setVisible(true);
        login.setSize(300, 220);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
