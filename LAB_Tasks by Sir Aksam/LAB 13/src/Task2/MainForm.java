/*
 * Created by JFormDesigner on Wed Jun 08 22:45:19 PKT 2022
 */

package Task2;

import java.awt.*;
import javax.swing.*;

/**
 * @author SP21-BCS-007
 */
public class MainForm extends JFrame {
    public MainForm() {
        initComponents();
        setTitle("MainForm");
        setContentPane(pMain);
        setSize(450, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        pMain = new JPanel();
        jtbToolBar = new JToolBar();
        jbFile = new JButton();
        jbEdit = new JButton();
        jbFind = new JButton();
        jbClient = new JButton();
        jbHelp = new JButton();
        jpCenter = new JPanel();
        textArea1 = new JTextArea();
        jpCenterLeft = new JPanel();
        jbFindBtn = new JButton();
        jbEditBtn = new JButton();
        jbExit = new JButton();
        jpBelow = new JPanel();
        jlFormat = new JLabel();
        jrbEmail = new JRadioButton();
        jrbName = new JRadioButton();

        //======== pMain ========
        {
            pMain.setLayout(new GridLayout(3, 0));

            //======== jtbToolBar ========
            {

                //---- jbFile ----
                jbFile.setText("File");
                jtbToolBar.add(jbFile);

                //---- jbEdit ----
                jbEdit.setText("Edit");
                jtbToolBar.add(jbEdit);

                //---- jbFind ----
                jbFind.setText("Find");
                jtbToolBar.add(jbFind);

                //---- jbClient ----
                jbClient.setText("Client");
                jtbToolBar.add(jbClient);

                //---- jbHelp ----
                jbHelp.setText("Help");
                jtbToolBar.add(jbHelp);
            }
            pMain.add(jtbToolBar);

            //======== jpCenter ========
            {
                jpCenter.setLayout(new GridLayout(1, 2));
                jpCenter.add(textArea1);

                //======== jpCenterLeft ========
                {
                    jpCenterLeft.setLayout(new GridBagLayout());
                    ((GridBagLayout) jpCenterLeft.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout) jpCenterLeft.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
                    ((GridBagLayout) jpCenterLeft.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout) jpCenterLeft.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                    //---- jbFindBtn ----
                    jbFindBtn.setText("Find");
                    jpCenterLeft.add(jbFindBtn, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- jbEditBtn ----
                    jbEditBtn.setText("Edit");
                    jpCenterLeft.add(jbEditBtn, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- jbExit ----
                    jbExit.setText("Exit");
                    jpCenterLeft.add(jbExit, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                jpCenter.add(jpCenterLeft);
            }
            pMain.add(jpCenter);

            //======== jpBelow ========
            {
                jpBelow.setLayout(new FlowLayout(FlowLayout.LEFT));

                //---- jlFormat ----
                jlFormat.setText("Format");
                jpBelow.add(jlFormat);

                //---- jrbEmail ----
                jrbEmail.setText("E-Mail");
                jpBelow.add(jrbEmail);

                //---- jrbName ----
                jrbName.setText("Name");
                jpBelow.add(jrbName);
            }
            pMain.add(jpBelow);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel pMain;
    private JToolBar jtbToolBar;
    private JButton jbFile;
    private JButton jbEdit;
    private JButton jbFind;
    private JButton jbClient;
    private JButton jbHelp;
    private JPanel jpCenter;
    private JTextArea textArea1;
    private JPanel jpCenterLeft;
    private JButton jbFindBtn;
    private JButton jbEditBtn;
    private JButton jbExit;
    private JPanel jpBelow;
    private JLabel jlFormat;
    private JRadioButton jrbEmail;
    private JRadioButton jrbName;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
    }
}
