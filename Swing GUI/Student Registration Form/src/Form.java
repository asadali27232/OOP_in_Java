
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Form extends JFrame {
    private JPanel jpMain;
    private JPanel jpName;
    private JPanel jpName0;
    private JPanel jpName1;
    private JPanel jpEmail;
    private JPanel jpName2;
    private JPanel jpEmail0;
    private JPanel jpEmail2;

    private JLabel jlFirstName;
    private JLabel jlLastName;
    private JLabel jlTitle;
    private JLabel jlNickname;
    private JLabel jlEmail;
    private JLabel jlFontTesting;
    private JLabel jlFormat;


    private JTextField jtfFirstName;
    private JTextField jtfLastName;
    private JTextField jtfTitle;
    private JTextField jtfNickname;
    private JTextField jtfEmail;

    private JButton jbAdd;
    private JButton jbOk;
    private JButton jbCancel;

    private JRadioButton jrbHTML;
    private JRadioButton jrbPlainText;
    private JRadioButton jrbCustom;
    private ButtonGroup radioGroup;

    private JCheckBox jcbEmail;
    private JCheckBox jcbName;

    private JComboBox<String> items;
    private String[] itemName;

    public Form() {
        super("Registration Form");

        jpMain = new JPanel();
        jpMain.setLayout(new GridLayout(2, 0, 10, 10));
        setContentPane(jpMain);

        initializeComponents();
        eventHadling();
    }

    public void initializeComponents() {
        jpName = new JPanel(new GridLayout(3, 0));
        Border border = BorderFactory.createTitledBorder("Name");
        jpName.setBorder(border);

        jpEmail = new JPanel(new GridLayout(3, 0));
        border = BorderFactory.createTitledBorder("E-mail");
        jpEmail.setBorder(border);

        jpName0 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpName1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpName2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        jpEmail0 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpEmail2 = new JPanel(new FlowLayout(FlowLayout.LEFT));


        jlFirstName = new JLabel("First Name:");
        jlLastName = new JLabel("Last Name:");
        jlTitle = new JLabel("Title:");
        jlNickname = new JLabel("  Nickname:");
        jlFormat = new JLabel("Format:");

        jtfFirstName = new JTextField("Asad", 20);
        jtfLastName = new JTextField("Ali", 20);
        jtfTitle = new JTextField("Slecet form list below", 20);
        jtfNickname = new JTextField("Slecet form list below", 20);

        itemName = new String[]{"item1", "item2", "item3", "item4"};
        items = new JComboBox<String>(itemName);
        items.setEditable(false);
        items.setMaximumRowCount(itemName.length);
        items.setPreferredSize(new Dimension(525, 20));

        jpName0.add(jlFirstName);
        jpName0.add(jtfFirstName);
        jpName0.add(jlLastName);
        jpName0.add(jtfLastName);
        jpName1.add(jlTitle);
        jpName1.add(jtfTitle);
        jpName1.add(jlNickname);
        jpName1.add(jtfNickname);
        jpName2.add(jlFormat);
        jpName2.add(items);
        jpName.add(jpName0, 0);
        jpName.add(jpName1, 1);
        jpName.add(jpName2, 2);
        jpMain.add(jpName, 0);

        jlEmail = new JLabel("E-mail Address:");
        jtfEmail = new JTextField("asadali27232@gmail.com", 35);
        jbAdd = new JButton("Add");

        jpEmail0.add(jlEmail);
        jpEmail0.add(jtfEmail);
        jpEmail0.add(jbAdd);
        jpEmail.add(jpEmail0, 0);

        jlFontTesting = new JLabel("Font Testing By 007-Developer:");
        jpEmail.add(jlFontTesting, 1);

        jrbHTML = new JRadioButton("HTML");
        jrbPlainText = new JRadioButton("Plain Text");
        jrbCustom = new JRadioButton("Custom");
        radioGroup = new ButtonGroup();
        radioGroup.add(jrbHTML);
        radioGroup.add(jrbPlainText);
        radioGroup.add(jrbCustom);

        jcbEmail = new JCheckBox("Hide Email Panel");
        jcbName = new JCheckBox("Hide Name Panel");

        jpEmail2.add(jrbHTML);
        jpEmail2.add(jrbPlainText);
        jpEmail2.add(jrbCustom);
        jpEmail2.add(jcbName);
        jpEmail2.add(jcbEmail);
        jpEmail.add(jpEmail2, 2);
        jpMain.add(jpEmail, 1);

        jbOk = new JButton("OK");
        jbCancel = new JButton("Cancel");

        jpEmail2.add(jbOk);
        jpEmail2.add(jbCancel);
    }

    public void eventHadling() {
        FocusGainedHandler focusGainedHandler = new FocusGainedHandler();
        jtfFirstName.addFocusListener(focusGainedHandler);
        jtfLastName.addFocusListener(focusGainedHandler);
        jtfTitle.addFocusListener(focusGainedHandler);
        jtfNickname.addFocusListener(focusGainedHandler);
        jtfEmail.addFocusListener(focusGainedHandler);

        jcbName.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jcbName.isSelected()) {
                    jlFirstName.setVisible(false);
                    jlLastName.setVisible(false);
                    jlTitle.setVisible(false);
                    jlNickname.setVisible(false);

                    jtfFirstName.setVisible(false);
                    jtfLastName.setVisible(false);
                    jtfTitle.setVisible(false);
                    jtfNickname.setVisible(false);

                    jlFormat.setVisible(false);
                    items.setVisible(false);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    jlFirstName.setVisible(true);
                    jlLastName.setVisible(true);
                    jlTitle.setVisible(true);
                    jlNickname.setVisible(true);

                    jtfFirstName.setVisible(true);
                    jtfLastName.setVisible(true);
                    jtfTitle.setVisible(true);
                    jtfNickname.setVisible(true);

                    jlFormat.setVisible(true);
                    items.setVisible(true);
                }
            }
        });

        jcbEmail.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jcbEmail.isSelected()) {
                    jlEmail.setVisible(false);
                    jtfEmail.setVisible(false);
                    jbAdd.setVisible(false);

                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    jlEmail.setVisible(true);
                    jtfEmail.setVisible(true);
                    jbAdd.setVisible(true);
                }
            }
        });

        jrbHTML.addItemListener(new radioHandler());
        jrbPlainText.addItemListener(new radioHandler());
        jrbCustom.addItemListener(new radioHandler());

        jbCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter 'Y' to cancel Registration Process");
                if (str.equals("y") || str.equals("Y")) {
                    System.exit(0);
                }
            }
        });

        jbOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtfFirstName.getText().equals("") || jtfLastName.getText().equals("") || jtfTitle.getText().equals("") || jtfNickname.getText().equals("") || jtfEmail.getText().equals("")) {
                    String message = "Fields listed below MUST be filled:\n";
                    if (jtfFirstName.getText().equals(""))
                        message += jlFirstName.getText() + "\n";
                    if (jtfLastName.getText().equals(""))
                        message += jlLastName.getText() + "\n";
                    if (jtfTitle.getText().equals(""))
                        message += jlTitle.getText() + "\n";
                    if (jtfNickname.getText().equals(""))
                        message += jlNickname.getText() + "\n";
                    if (jtfEmail.getText().equals(""))
                        message += jlEmail.getText() + "\n";
                    JOptionPane.showMessageDialog(null, message);
                } else JOptionPane.showMessageDialog(null, "Registered Successfully");
            }
        });

        jtfEmail.addFocusListener(new FocusAdapter() {

            @Override
            public void focusLost(FocusEvent e) {
                if (!jtfEmail.getText().equals("")) {
                    String email = jtfEmail.getText();
                    String emailParts2[] = email.split("@");
                    String emailParts3[] = emailParts2[1].split("[.]", 0);

                    if (!(emailParts3[1].equals("com") || emailParts3[1].equals("net"))) {
                        JOptionPane.showMessageDialog(null, "Invalid Email \n e.g abc@def.com");
                    }
                }
            }
        });

        items.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jtfTitle.setText(itemName[items.getSelectedIndex()]);
                    jtfNickname.setText(itemName[items.getSelectedIndex()]);
                }
            }
        });

        jbAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            writeTextFile();
            }
        });
    }

    public class radioHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (jrbHTML.isSelected()) {
                jlFontTesting.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            } else if (jrbCustom.isSelected()) {
                jlFontTesting.setFont(new Font("Serif", Font.BOLD, 12));
            } else if (jrbPlainText.isSelected()) {
                jlFontTesting.setFont(new Font("Serif", Font.PLAIN, 15));
            }
        }
    }

    public class FocusGainedHandler implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            if (e.getSource() == jtfFirstName) {
                jtfFirstName.setText("");
            } else if (e.getSource() == jtfLastName) {
                jtfLastName.setText("");
            } else if (e.getSource() == jtfTitle) {
                jtfTitle.setText("");
            } else if (e.getSource() == jtfNickname) {
                jtfNickname.setText("");
            } else if (e.getSource() == jtfEmail) {
                jtfEmail.setText("");
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
        }
    }

    private void writeTextFile() {
        PrintWriter fileOutput = null;
        try {
            fileOutput = new PrintWriter(new FileOutputStream("userData.txt", true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        fileOutput.println(jtfFirstName.getText());
        fileOutput.println(jtfLastName.getText());
        fileOutput.println(jtfEmail.getText());
        fileOutput.println();

        JOptionPane.showMessageDialog(null, "Text File Written Successfully!");
        fileOutput.close();
    }


    public static void main(String[] args) {
        Form form = new Form();
        form.setVisible(true);
        form.setSize(650, 410);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
