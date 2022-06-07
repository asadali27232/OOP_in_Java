import javax.swing.*;

public class Demo extends JFrame {
    private JPanel demoPanel;
    private JLabel label1;
    private JEditorPane writeSomethingEditorPane;

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setContentPane(demo.demoPanel);
        demo.setTitle("Demo");
        demo.setSize(1000, 600);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
