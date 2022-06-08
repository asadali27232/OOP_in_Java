import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class Calculator extends JFrame {
    public Calculator() {
        initComponents();
        registeringEvent();
        setContentPane(jpMain);
        setTitle("Calculator");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        jpMain = new JPanel();
        jtfDisplay = new JTextField();
        jb7 = new JButton();
        jb8 = new JButton();
        jb9 = new JButton();
        jbDivide = new JButton();
        jb4 = new JButton();
        jb5 = new JButton();
        jb6 = new JButton();
        jbMultiply = new JButton();
        jb1 = new JButton();
        jb2 = new JButton();
        jb3 = new JButton();
        jbMinus = new JButton();
        jbDot = new JButton();
        jb0 = new JButton();
        jbEqual = new JButton();
        jbPlus = new JButton();

        //======== jpMain ========
        {
            jpMain.setLayout(new GridBagLayout());

            //---- jtfDisplay ----
            jtfDisplay.setBackground(Color.white);
            jpMain.add(jtfDisplay, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 0), 0, 0));

            //---- jb7 ----
            jb7.setText("7");
            jpMain.add(jb7, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jb8 ----
            jb8.setText("8");
            jpMain.add(jb8, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jb9 ----
            jb9.setText("9");
            jpMain.add(jb9, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jbDivide ----
            jbDivide.setText("/");
            jpMain.add(jbDivide, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 0), 0, 0));

            //---- jb4 ----
            jb4.setText("4");
            jpMain.add(jb4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jb5 ----
            jb5.setText("5");
            jpMain.add(jb5, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jb6 ----
            jb6.setText("6");
            jpMain.add(jb6, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jbMultiply ----
            jbMultiply.setText("x");
            jpMain.add(jbMultiply, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 0), 0, 0));

            //---- jb1 ----
            jb1.setText("1");
            jpMain.add(jb1, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jb2 ----
            jb2.setText("2");
            jpMain.add(jb2, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jb3 ----
            jb3.setText("3");
            jpMain.add(jb3, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 10), 0, 0));

            //---- jbMinus ----
            jbMinus.setText("-");
            jpMain.add(jbMinus, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 0), 0, 0));

            //---- jbDot ----
            jbDot.setText(".");
            jpMain.add(jbDot, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 10), 0, 0));

            //---- jb0 ----
            jb0.setText("0");
            jpMain.add(jb0, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 10), 0, 0));

            //---- jbEqual ----
            jbEqual.setText("=");
            jpMain.add(jbEqual, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 10), 0, 0));

            //---- jbPlus ----
            jbPlus.setText("+");
            jpMain.add(jbPlus, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel jpMain;
    private JTextField jtfDisplay;
    private JButton jb7;
    private JButton jb8;
    private JButton jb9;
    private JButton jbDivide;
    private JButton jb4;
    private JButton jb5;
    private JButton jb6;
    private JButton jbMultiply;
    private JButton jb1;
    private JButton jb2;
    private JButton jb3;
    private JButton jbMinus;
    private JButton jbDot;
    private JButton jb0;
    private JButton jbEqual;
    private JButton jbPlus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    //======== RegisteringEvent ========
    private void registeringEvent() {
        ActionListen actionListen = new ActionListen();
        this.jb0.addActionListener(actionListen);
        this.jb1.addActionListener(actionListen);
        this.jb2.addActionListener(actionListen);
        this.jb3.addActionListener(actionListen);
        this.jb4.addActionListener(actionListen);
        this.jb5.addActionListener(actionListen);
        this.jb6.addActionListener(actionListen);
        this.jb7.addActionListener(actionListen);
        this.jb8.addActionListener(actionListen);
        this.jb9.addActionListener(actionListen);
        this.jbEqual.addActionListener(actionListen);
        this.jbPlus.addActionListener(actionListen);
        this.jbMinus.addActionListener(actionListen);
        this.jbMultiply.addActionListener(actionListen);
        this.jbDivide.addActionListener(actionListen);
        this.jbDot.addActionListener(actionListen);
    }

    //---- EventHandling ----
    private class ActionListen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jb0) {
                jtfDisplay.setText(jtfDisplay.getText() + "0");
            } else if (e.getSource() == jb1) {
                jtfDisplay.setText(jtfDisplay.getText() + "1");
            } else if (e.getSource() == jb2) {
                jtfDisplay.setText(jtfDisplay.getText() + "2");
            } else if (e.getSource() == jb3) {
                jtfDisplay.setText(jtfDisplay.getText() + "3");
            } else if (e.getSource() == jb4) {
                jtfDisplay.setText(jtfDisplay.getText() + "4");
            } else if (e.getSource() == jb5) {
                jtfDisplay.setText(jtfDisplay.getText() + "5");
            } else if (e.getSource() == jb6) {
                jtfDisplay.setText(jtfDisplay.getText() + "6");
            } else if (e.getSource() == jb7) {
                jtfDisplay.setText(jtfDisplay.getText() + "7");
            } else if (e.getSource() == jb8) {
                jtfDisplay.setText(jtfDisplay.getText() + "8");
            } else if (e.getSource() == jb9) {
                jtfDisplay.setText(jtfDisplay.getText() + "9");
            } else if (e.getSource() == jbPlus) {
                jtfDisplay.setText(jtfDisplay.getText() + " + ");
            } else if (e.getSource() == jbMinus) {
                jtfDisplay.setText(jtfDisplay.getText() + " - ");
            } else if (e.getSource() == jbMultiply) {
                jtfDisplay.setText(jtfDisplay.getText() + " x ");
            } else if (e.getSource() == jbDivide) {
                jtfDisplay.setText(jtfDisplay.getText() + " / ");
            } else if (e.getSource() == jbEqual) {
                jtfDisplay.setText("Ans");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
