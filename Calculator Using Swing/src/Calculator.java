import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class Calculator extends JFrame{
    public Calculator() {
        initComponents();
        setContentPane(jpMain);
        setTitle("Calculator");
        setSize(200,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        jpMain = new JPanel();
        jtfDisplay = new JTextField();
        jbSeven = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button15 = new JButton();
        button14 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        button19 = new JButton();

        //======== jpMain ========
        {
            jpMain.setLayout(new GridBagLayout());

            //---- jtfDisplay ----
            jtfDisplay.setEditable(false);
            jtfDisplay.setBackground(Color.white);
            jpMain.add(jtfDisplay, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- jbSeven ----
            jbSeven.setText("7");
            jpMain.add(jbSeven, new GridBagConstraints(0, 2, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button5 ----
            button5.setText("8");
            jpMain.add(button5, new GridBagConstraints(1, 2, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button6 ----
            button6.setText("9");
            jpMain.add(button6, new GridBagConstraints(2, 2, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button7 ----
            button7.setText("/");
            jpMain.add(button7, new GridBagConstraints(3, 2, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button8 ----
            button8.setText("4");
            jpMain.add(button8, new GridBagConstraints(0, 4, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button9 ----
            button9.setText("5");
            jpMain.add(button9, new GridBagConstraints(1, 4, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button10 ----
            button10.setText("6");
            jpMain.add(button10, new GridBagConstraints(2, 4, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button11 ----
            button11.setText("x");
            jpMain.add(button11, new GridBagConstraints(3, 4, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button12 ----
            button12.setText("1");
            jpMain.add(button12, new GridBagConstraints(0, 6, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button13 ----
            button13.setText("2");
            jpMain.add(button13, new GridBagConstraints(1, 6, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button15 ----
            button15.setText("-");
            jpMain.add(button15, new GridBagConstraints(3, 6, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button14 ----
            button14.setText("3");
            jpMain.add(button14, new GridBagConstraints(2, 6, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button16 ----
            button16.setText(".");
            jpMain.add(button16, new GridBagConstraints(0, 8, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button17 ----
            button17.setText("0");
            jpMain.add(button17, new GridBagConstraints(1, 8, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button18 ----
            button18.setText("=");
            jpMain.add(button18, new GridBagConstraints(2, 8, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button19 ----
            button19.setText("+");
            jpMain.add(button19, new GridBagConstraints(3, 8, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel jpMain;
    private JTextField jtfDisplay;
    private JButton jbSeven;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button15;
    private JButton button14;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
