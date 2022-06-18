import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Double.parseDouble;


public class Calculator extends JFrame {
    private JLabel jlNum1;
    private JLabel jlNum2;
    private JLabel jlResult;
    private JTextField jtfNum1;
    private JTextField jtfNum2;
    private JTextField jtfResult;
    private JButton jbAdd;
    private JButton jbSubtract;
    private JButton jbMultiply;
    private JButton jbDivide;
    private JPanel jpMain;

    public Calculator() {
        super("Calculator");
        initializeComponents();
    }

    private void initializeComponents() {

        jpMain = new JPanel();
        jpMain.setLayout(new FlowLayout());
        setContentPane(jpMain);


        jlNum1 = new JLabel("First Number:");
        jlNum2 = new JLabel("Second Number:");
        jlResult = new JLabel("Result:");

        jtfNum1 = new JTextField(10);
        jtfNum2 = new JTextField(10);
        jtfResult = new JTextField(10);

        jbAdd = new JButton("Add");
        jbSubtract = new JButton("Subtract");
        jbMultiply = new JButton("Multiply");
        jbDivide = new JButton("Divide");

        jbAdd.addActionListener(new AddSub());
        jbSubtract.addActionListener(new AddSub());

        jbMultiply.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num1String = jtfNum1.getText();
                String num2String = jtfNum1.getText();

                if (num1String.equals("") || num2String.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter First and Second Number");
                    jtfNum1.setText("");
                    jtfNum2.setText("");
                    return;
                }

                double num1 = parseDouble(num1String);
                double num2 = parseDouble(num2String);
                double result = 0.0;

                result = num1 * num2;

                jtfResult.setText(String.valueOf(result));
            }
        });

        jbDivide.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num1String = jtfNum1.getText();
                String num2String = jtfNum1.getText();

                if (num1String.equals("") || num2String.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter First and Second Number");
                    jtfNum1.setText("");
                    jtfNum2.setText("");
                    return;
                }

                double num1 = parseDouble(num1String);
                double num2 = parseDouble(num2String);
                double result = 0.0;

                result = num1 / num2;

                jtfResult.setText(String.valueOf(result));
            }
        });

        this.addWindowListener(new hideButton());

        jpMain.add(jlNum1);
        jpMain.add(jtfNum1);
        jpMain.add(jlNum2);
        jpMain.add(jtfNum2);
        jpMain.add(jlResult);
        jpMain.add(jtfResult);
        jpMain.add(jbAdd);
        jpMain.add(jbSubtract);
        jpMain.add(jbMultiply);
        jpMain.add(jbDivide);
    }

    private class AddSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String num1String = jtfNum1.getText();
            String num2String = jtfNum1.getText();

            if (num1String.equals("") || num2String.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter First and Second Number");
                jtfNum1.setText("");
                jtfNum2.setText("");
                return;
            }

            double num1 = parseDouble(num1String);
            double num2 = parseDouble(num2String);
            double result = 0.0;

            if (e.getSource() == jbAdd) {
                result = num1 + num2;
            } else if (e.getSource() == jbSubtract) {
                result = num1 - num2;
            }
            jtfResult.setText(String.valueOf(result));
        }
    }

    public class hideButton extends WindowAdapter {

        @Override
        public void windowActivated(WindowEvent e) {
            jbAdd.setVisible(true);
            jbSubtract.setVisible(true);
            jbMultiply.setVisible(true);
            jbDivide.setVisible(true);
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            jbAdd.setVisible(false);
            jbSubtract.setVisible(false);
            jbMultiply.setVisible(false);
            jbDivide.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setSize(650, 100);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setVisible(true);
    }
}
