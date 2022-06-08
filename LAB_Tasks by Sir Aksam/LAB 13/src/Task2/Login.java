/*
 * Created by JFormDesigner on Wed Jun 08 21:40:16 PKT 2022
 */

package Task2;

import java.awt.*;
import javax.swing.*;

/**
 * @author SP21-BCS-007
 */
public class Login extends JFrame{
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        pMain = new JPanel();
        jlIcon = new JLabel();
        jlUsername = new JLabel();
        jtfUsername = new JTextField();
        jlPassword = new JLabel();
        jtfPassword = new JTextField();
        jbOK = new JButton();
        jbCancel = new JButton();

        //======== pMain ========
        {
            pMain.setLayout(new FlowLayout());

            //---- jlIcon ----
            jlIcon.setIcon(new ImageIcon(getClass().getResource("/Task2/img_ClientDB.png")));
            jlIcon.setToolTipText("ClientDB");
            pMain.add(jlIcon);

            //---- jlUsername ----
            jlUsername.setText("Username");
            pMain.add(jlUsername);

            //---- jtfUsername ----
            jtfUsername.setColumns(15);
            pMain.add(jtfUsername);

            //---- jlPassword ----
            jlPassword.setText("Password");
            pMain.add(jlPassword);

            //---- jtfPassword ----
            jtfPassword.setColumns(15);
            pMain.add(jtfPassword);

            //---- jbOK ----
            jbOK.setText("OK");
            pMain.add(jbOK);

            //---- jbCancel ----
            jbCancel.setText("Cancel");
            pMain.add(jbCancel);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel pMain;
    private JLabel jlIcon;
    private JLabel jlUsername;
    private JTextField jtfUsername;
    private JLabel jlPassword;
    private JTextField jtfPassword;
    private JButton jbOK;
    private JButton jbCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        Login login = new Login();
        login.setTitle("Login");
        login.setContentPane(login.pMain);
        login.setVisible(true);
        login.setSize(300, 220);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
